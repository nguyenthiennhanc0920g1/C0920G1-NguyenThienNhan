SELECT * FROM table;
SELECT age, name FROM people;

SELECT age, name FROM people WHERE age > 10;
SELECT age, name FROM people WHERE age > 10 AND age < 20;
SELECT age, name FROM people WHERE age > 10 OR name = 'Joe';

SELECT name, age FROM people ORDER BY age DESC;(ASC là tăng dần, DESC là giảm dần)
SELECT name, age FROM people ORDER BY name ASC, age DESC;

SELECT age, name, height FROM people LEFT JOIN heights USING (name);
SELECT * FROM sinhvien INNER JOIN lop ON sinhvien.LopID = lop.LopID;
SELECT column_list FROM t1 INNER JOIN t2 ON join_condition1 WHERE where_conditions;
SELECT * 
FROM
    sinhvien 
    INNER JOIN lop ON sinhvien.LopID = lop.LopID
    INNER JOIN khoa ON sinhvien.KhoaID = khoa.KhoaId
    WHERE lop.TenLop = 'TOAN'
    SELECT TenSV, TenLop, l.LopID
FROM sinhvien AS sv INNER JOIN lop AS l ON sv.LopID = l.LopID;

SELECT age AS person_age FROM people;

SELECT age, name FROM customers
 UNION 
 SELECT age, name FROM staff;
 SELECT age, name FROM customers
 UNION ALL
 SELECT age, name FROM staff;
 
 INSERT INTO people(name, age) VALUES('Joe', 102);
 
 UPDATE people SET name = 'Joe', age = 101;
 UPDATE people SET name = 'Joe', age = 101 WHERE name = 'James';
 UPDATE people SET name = 'Joe', age = 101 WHERE (name = 'James' AND age = 100) OR name = 'Ryan';
 
 DELETE FROM people WHERE name = 'Joe';
 
 
 ALTER TABLE ten_bang
   ADD cot1 dinh_nghia_cot,
       cot2 dinh_nghia_cot,
       …
       cot_n dinh_nghia_cot;
       ALTER TABLE Quantrimang
   ADD Bientap VARCHAR(50),
       Trangthai VARCHAR(50);
       
       ALTER TABLE Quantrimang
   ALTER COLUMN Trangthai VARCHAR(75) NOT NULL;
   (Lệnh trên sẽ sửa cột Trangthai sang kiểu dữ liệu VARCHAR(75) và không chấp nhận giá trị NULL)
   
   ALTER TABLE ten_bang
   DROP COLUMN ten_cot;
   
   DROP TABLE people;
   
   CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);
