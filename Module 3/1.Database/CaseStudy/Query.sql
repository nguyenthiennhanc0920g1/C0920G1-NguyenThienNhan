use case_study_furama_module_3;

select * from Services;
select * from Customers;
select * from Employees;
select * from Contracts;
select * from ContractDetails;

-- Task 1: --
-- Task 2: --
select * from Employees where (full_name_employee like '% % H%')
						or (full_name_employee like '% % K%')
                        or (full_name_employee like '% % T%')
                        and length(full_name_employee) <= 15;
-- Task 3: --
select * from Customers where ((address_customer like '%Da Nang%')
						or (address_customer like '%Quang Tri%'))
                        and (round((DATEDIFF(CURDATE(), Customers.birthday_customer))/365,0) >= 18)
                        and (round((DATEDIFF(CURDATE(), Customers.birthday_customer))/365,0) <= 50);
select round((DATEDIFF(CURDATE(), Customers.birthday_customer))/365,0) from customers;
-- task 4 
select customers.id_customer,
customers.full_name_customer, contracts.id_contract, customers.id_type_customer, count(customers.id_customer)
as so_lan
from customers
join contracts
on contracts.id_customer = customers.id_customer
where customers.id_type_customer = 1
group by customers.id_customer
order by so_lan asc;

-- task 5
select customers.id_customer, customers.full_name_customer,
contracts.id_contract, contracts.contracting_date, contracts.contract_end_date,
services.id_service, services.name_service, ServiceAccompanied.price_service_accompanied,
ContractDetails.amount, services.price_rent,
(ServiceAccompanied.price_service_accompanied * ContractDetails.amount) as tongtien 
from customers
left join contracts on customers.id_customer = contracts.id_customer
left join services on contracts.id_service = services.id_service
left join ContractDetails on contracts.id_contract = ContractDetails.id_contract 
left join ServiceAccompanied 
on ContractDetails.id_service_accompanied = ServiceAccompanied.id_service_accompanied;

-- task 6
select services.id_service, services.name_service, services.price_rent,
typeServices.name_service, contracts.contracting_date, contracts.contract_end_date from contracts
join services
on services.id_service = contracts.id_service
join typeServices
on services.id_type_service = typeServices.id_type_service
where not ((year(contracts.contract_end_date) = 2019 
and month(contracts.contract_end_date) < 4) or (year(contracts.contract_end_date) < 2019));

-- task 7
 select services.id_service, services.name_service, services.area, services.capacity_people,
 services.price_rent, TypeServices.name_service, contracts.contracting_date 
 from services 
 join TypeServices on services.id_type_service = TypeServices.id_type_service
 join contracts on contracts.id_service = services.id_service
 where year(contracts.contracting_date) = 2018 and services.id_service 
 not in (select services.id_service from services
 where year(contracts.contracting_date) = 2019 );
 
 -- task 8
	-- cach 1.
    select distinct customers.full_name_customer from customers;
    -- cach 2.
    select customers.full_name_customer 
    from customers group by full_name_customer;
    -- cach 3.
    SELECT customers.full_name_customer 
	from customers
	UNION
	SELECT customers.full_name_customer 
	from customers;
    
    -- task 9.
    SELECT month(contracts.contracting_date) as 'thang' ,
    count(month(contracts.contracting_date)) as 'soHopDong' 
	FROM contracts
	WHERE year(contracts.contracting_date) = 2019
	GROUP BY contracting_date
	ORDER BY contracts.contracting_date;
    
    -- task 10.
    SELECT contracts.id_contract, contracts.contracting_date, contracts.contract_end_date, 
    contracts.deposits, count(ContractDetails.id_contract_detail) as 'so_luong_dv_di_kem'
	FROM contracts
	INNER JOIN ContractDetails on contracts.id_contract = ContractDetails.id_contract
	GROUP BY contracts.id_contract;
    
    -- task 11.
    SELECT ServiceAccompanied.id_service_accompanied,
	 ServiceAccompanied.name_service_accompanied,
	 ServiceAccompanied.price_service_accompanied, ServiceAccompanied.unit, 
	 ServiceAccompanied.status_availability,
	 TypeCistomers.name_type_customer, 
	 customers.address, 
	 customers.full_name_customer
	FROM ServiceAccompanied
	INNER JOIN ContractDetails on ServiceAccompanied.id_service_accompanied = ContractDetails.id_service_accompanied
	INNER JOIN contracts on ContractDetails.id_contract = contracts.id_contract
	INNER JOIN customers on contracts.id_customer = customers.id_customer
	INNER JOIN typeCustomers on customers.id_type_customer = typeCustomers.id_type_customer
	WHERE typeCustomers.name_type_customer = 'Vip' 
	AND (customers.address = 'Da Nang' or customers.address = 'Quang Binh');
    
    -- task 12.
	SELECT contracts.id_contract,
	 employees.full_name_employee,
	 customers.full_name_customer,
	 customers.phone_number_customer,
	 services.name_service,
	 count(ContractDetails.id_contract_detail) as 'SoLuongDichVuDikem ',
	 contracts.deposits
	FROM contracts 
	INNER JOIN employees on employees.id_employees = contracts.id_employee
	INNER JOIN customers on customers.id_customer = contracts.id_customer
	INNER JOIN services on services.id_service = contracts.id_service
	INNER JOIN ContractDetails on ContractDetails.id_contract= contracts.id_contract
	WHERE (month(contracts.contracting_date)>9 and year(contracts.contracting_date)=2019)
	and contracts.id_contract NOT IN (month(contracts.contracting_date) < 7 AND year(contracts.contracting_date) = 2019);
    
-- task 13
    select ServiceAccompanied.id_service_accompanied, ServiceAccompanied.name_service_accompanied,
    count(ContractDetails.id_service_accompanied) as count
    from ContractDetails 
    join ServiceAccompanied on ContractDetails.id_service_accompanied = ServiceAccompanied.id_service_accompanied
    group by ContractDetails.id_service_accompanied 
    having count = 
    (select count(ContractDetails.id_service_accompanied) as count 
    from ContractDetails
    join ServiceAccompanied on ContractDetails.id_service_accompanied = ServiceAccompanied.id_service_accompanied
    group by ContractDetails.id_service_accompanied  
    order by count desc
    limit 1);
    
    -- task 14
  select ServiceAccompanied.id_service_accompanied, ServiceAccompanied.name_service_accompanied,count(ContractDetails.id_service_accompanied) as so_lan
    from customers 
    join contracts on customers.id_customer = contracts.id_customer
    join ContractDetails on contracts.id_contract = ContractDetails.id_contract
    join ServiceAccompanied on ContractDetails.id_service_accompanied = ServiceAccompanied.id_service_accompanied 
    group by id_service_accompanied having so_lan = 1
    ;  
    
    -- task 15
    select employees.id_employee, employees.full_name_employee, 
    levels.`level`, Departments.name_department, employees.phone_number_employee, employees.address, count(contracts.id_employee) as so_hop_dong
    from employees
    join levels on employees.id_level = levels.id_level
    join departments on employees.id_department = departments.id_department
    join contracts on contracts.id_employee = employees.id_employee
    where year(contracts.contracting_date) > 2017 and year(contracts.contracting_date) < 2020
    group by id_employee having amount < 4;
    
    -- task 16
    SET SQL_SAFE_UPDATES = 0;
    delete
	 FROM employees 
	 WHERE employees.in_employee 
	  not IN (
	 SELECT contracts.id_employee 
	 FROM contracts 
	 WHERE year(contracts.contracting_date) BETWEEN 2017 and 2019
	 );
    
    -- task 17 
	UPDATE customers
	set customers.id_type_customer = 1
	WHERE  customers.id_type_customer = 2 and  customers.id_customer IN (
	 SELECT contracts.id_customer FROM contracts WHERE contracts.total_money>= 1500
     and year(contracts.contracting_date) = 2019
	 );
     
     -- task 18	
      DELETE 
	  FROM customers 
	  WHERE customers.id_customer in (
	  SELECT contracts.id_customer 
	  FROM contracts 
	  WHERE year(contracts.contracting_date) < 2016
	  );
 
 -- task 19
	update ServiceAccompanied 
	set ServiceAccompanied.price_service_accompanied = ServiceAccompanied.price_service_accompanied *2
	WHERE  ServiceAccompanied.id_service_accompanied in ( 
	SELECT ContractDetails.id_service_accompanied 
	FROM ContractDetails  
	JOIN contracts  ON contracts.id_contract = ContractDetails.id_contract
	WHERE year(contracts.contracting_date)=2019
	GROUP BY ContractDetails.id_service_accompanied
	HAVING count(ContractDetails.id_service_accompanied) >=3
	);
    
    -- task 20
    CREATE VIEW khach_hang_view as 
	SELECT customers.id_customer, customers.full_name_customer,customers.email_customer,
    customers.phone_number_customer, customers.birthday_customer, customers.address
	FROM customers;
	SELECT * FROM khach_hang_view;
    
	CREATE VIEW nhanvien_view as
	SELECT employees.id_employee, employees.full_name_employee, employees.email_customer,
    employees.phone_number_employee, employees.birthday_employee, employees.address
	FROM employees;
	SELECT * FROM nhan_vien_view;

