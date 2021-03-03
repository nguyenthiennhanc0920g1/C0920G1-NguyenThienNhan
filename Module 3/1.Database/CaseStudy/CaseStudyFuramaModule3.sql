DROP DATABASE IF EXISTS case_study_furama_module_3;
CREATE DATABASE case_study_furama_module_3;
USE case_study_furama_module_3;

CREATE TABLE `Positions`(
id_position INT PRIMARY KEY,
name_positon VARCHAR(45)
);

CREATE TABLE `Levels`(
id_level INT PRIMARY KEY,
`level` VARCHAR(45)
);

CREATE TABLE Departments(
id_department INT PRIMARY KEY,
name_department VARCHAR(45)
);

CREATE TABLE TypeCustomers(
id_type_customer INT PRIMARY KEY,
name_type_customer VARCHAR(45)
);

CREATE TABLE ServiceAccompanied(
id_service_accompanied INT PRIMARY KEY, -- dịch vụ đi kèm -- 
name_service_accompanied VARCHAR(45),
price_service_accompanied INT,
unit INT, -- đơn vị --
status_availability VARCHAR(45) -- trạng thái khả dụng -- 
);

CREATE TABLE TypeServices(
id_type_service INT PRIMARY KEY,
name_service VARCHAR(45)
);

CREATE TABLE TypeRents(
id_type_rent INT PRIMARY KEY,
name_type_rent VARCHAR(45),
price_rent INT
);

CREATE TABLE Employees(
id_employee INT AUTO_INCREMENT PRIMARY KEY,
full_name_employee VARCHAR(255),
id_position INT,
id_level INT,
id_department INT,
birthday_employee DATE,
id_card_employee VARCHAR(45),
salary VARCHAR(45),
phone_number_employee VARCHAR(45),
email_employee VARCHAR(45),
address_employee VARCHAR(45),
foreign key (id_position) references Positions(id_position),
foreign key (id_level) references Levels(id_level),
foreign key (id_department) references Departments(id_department)
);

CREATE TABLE Customers(
id_customer INT AUTO_INCREMENT PRIMARY KEY,
id_type_customer INT,
full_name_customer VARCHAR(45),
birthday_customer DATE,
id_card_customer VARCHAR(45),
phone_number_customer VARCHAR(45),
email_customer VARCHAR(45),
address_customer VARCHAR(45),
foreign key (id_type_customer) references TypeCustomers(id_type_customer)
);

CREATE TABLE Services(
id_service INT AUTO_INCREMENT PRIMARY KEY,
name_service VARCHAR(45),
area INT,
amount_floor INT,
capacity_people VARCHAR(45), -- số người tối đa --  
price_rent VARCHAR(45),
id_type_rent INT,
id_type_service INT,
`status` VARCHAR(45),
foreign key (id_type_rent) references TypeRents(id_type_rent),
foreign key (id_type_service) references TypeServices(id_type_service)
);

CREATE TABLE Contracts(
id_contract INT AUTO_INCREMENT PRIMARY KEY,
id_employee INT,
id_customer INT,
id_service INT,
contracting_date DATE,
contract_end_date DATE,
deposits INT,
total_money INT,
foreign key (id_employee) references Employees(id_employee),
foreign key (id_customer) references Customers(id_customer),
foreign key (id_service) references Services(id_service)
);

CREATE TABLE ContractDetails(
id_contract_detail INT AUTO_INCREMENT PRIMARY KEY,
id_contract INT,
id_service_accompanied INT, -- dịch vụ đi kèm -- 
amount int,
foreign key (id_contract) references Contracts(id_contract),
foreign key (id_service_accompanied) references ServiceAccompanied(id_service_accompanied)
);