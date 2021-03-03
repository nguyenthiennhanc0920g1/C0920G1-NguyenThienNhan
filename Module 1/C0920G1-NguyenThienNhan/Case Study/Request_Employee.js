// TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2
let employees = []; // Array Employee

let fullName = document.getElementById('inName');
let identifyCard = document.getElementById('inIdCard');
let birthday = document.getElementById('inBirth');
let email = document.getElementById('inEmail');
let phone = document.getElementById('inPhone');
let level = document.getElementById('inLevel');
let position = document.getElementById('inPosition');
let department = document.getElementById('inDepartment');
let salary = document.getElementById('salary');

function checkData() {

    document.getElementById('outName').innerHTML = fullName.value;
    document.getElementById('outIdCard').innerHTML = identifyCard.value;
    //document.getElementById('outBirth').innerHTML = birthday.value;
    document.getElementById('outEmail').innerHTML = email.value;
    document.getElementById('outPhone').innerHTML = phone.value;
    document.getElementById('outLevel').innerHTML = level.value;
    document.getElementById('outPosition').innerHTML = position.value;
    document.getElementById('outDepartment').innerHTML = department.value;

    document.getElementById('post').style.display = "none";
    document.getElementById('sidebar').style.display = "block";
}

function editData() {
    document.getElementById('sidebar').style.display = "none";
    document.getElementById('post').style.display = "block";
}

// function total() {
//     //Address Discount
//     let subsAddress = ['Da Nang', 'Đà Nẵng', 'Danang', 'Hue', 'Huế', 'Quang Nam', 'Quảng Nam', 'Quangnam'];
//     let addressDiscount;
//     if (address.value.includes(subsAddress[0]) || address.value.includes(subsAddress[1]) || address.value.includes(subsAddress[2])) {
//         addressDiscount = 20;
//     } else if (address.value.includes(subsAddress[3]) || address.value.includes(subsAddress[4])) {
//         addressDiscount = 10;
//     } else if (address.value.includes(subsAddress[5]) || address.value.includes(subsAddress[6]) || address.value.includes(subsAddress[7])) {
//         addressDiscount = 5;
//     } else {
//         addressDiscount = 0;
//     }
//     // Customer Discount
//     let subsService = ['Diamond', 'Platinum', 'Gold', 'Silver', 'Member'];
//     let customerDiscount;
//     if (customerType.value.includes(subsService[0])) {
//         customerDiscount = 15;
//     } else if (customerType.value.includes(subsService[1])) {
//         customerDiscount = 10;
//     } else if (customerType.value.includes(subsService[2])) {
//         customerDiscount = 5;
//     } else if (customerType.value.includes(subsService[3])) {
//         customerDiscount = 2;
//     } else if (customerType.value.includes(subsService[4])) {
//         customerDiscount = 0;
//     } else {
//         customerDiscount = 0;
//     }
//     //Rent Day Discount
//     let rentDaysDiscount;
//     if (rentDays.value >= 7) {
//         rentDaysDiscount = 30;
//     } else if (rentDays.value >= 5) {
//         rentDaysDiscount = 20;
//     } else if (rentDays.value >= 2) {
//         rentDaysDiscount = 10;
//     } else {
//         rentDaysDiscount = 0;
//     }
//     // Type of service
//     let moneyService = ['Villa ($500/day)', 'House ($300/day)', 'Room ($100/day)'];
//     let service;
//     if (typeOfService.value.includes(moneyService[0])) {
//         service = 500;
//     } else if (typeOfService.value.includes(moneyService[1])) {
//         service = 300;
//     } else if (typeOfService.value.includes(moneyService[2])) {
//         service = 100;
//     } else {
//         service = 0;
//     }
//     //Total pay
//     let discountPay = addressDiscount + rentDaysDiscount + customerDiscount;
//     let totalPay = service * rentDays.value - discountPay;
//     document.getElementById('pay').innerHTML = totalPay + '$';
// }

// TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3 TASK 3

// INPUT CHARACTER LIMIT
function limitMaxText(limitField, limitNum) {
    if (limitField.value.length > limitNum) {
        limitField.value = limitField.value.substring(0, limitNum);
    }
}

function limitMinText(limitField) {
    if (limitField.value.length < 8) {
        alert('Input Wrong')
    }
}

//Only number input
function isNumberKey(evt) {
    let charCode = (evt.which) ? evt.which : event.keyCode;
    return !(charCode > 31 && (charCode < 48 || charCode > 57));
}

// Email Format
function checkEmail() {
    let emailReg = /^(\w+@\w{3,6}[.]\w{2,6})$/;
    if (!emailReg.test(email.value)) {
        alert('Input Wrong');
    }
}

//Birthday format
function checkBirth() {
    let arrBirth = birthday.value.split('-', 3);
    console.log(arrBirth);
    let dd = arrBirth[2];
    let mm = arrBirth[1];
    let yyyy = arrBirth[0];
    document.getElementById('outBirth').innerHTML = dd + '/' + mm + '/' + yyyy;
}

//Name Format
function checkX(x) {
    function clearEmpty(word) {
        return word !== "";
    }

    let arrX = x.value.split(' ').filter(clearEmpty);
    let completeX = "";
    for (let i = 0; i < arrX.length; i++) {
        let char = arrX[i].charAt(0).toUpperCase() + arrX[i].slice(1).toLowerCase();
        completeX += char + ' ';
    }
    x.value = completeX.trim();
}

// TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4 TASK 4

function finish() {
    const employee = {
        fullName: fullName.value,
        identifyCard: identifyCard.value,
        birthday: birthday.value,
        email: email.value,
        phone: phone.value,
        level: level.value,
        position: position.value,
        department: department.value,
        //salary: salary.innerHTML,
    };
    employees.push(employee);
    console.log(employees);
    displayEmployee();
    editData();
}

function displayEmployee() {
    let ol = document.getElementById("list");
    $('li').remove();
    for (let i = 0; i < employees.length; i++) {
        let employee = employees[i];
        let str = employee.fullName + "-" + employee.identifyCard;
        let li = document.createElement("li");
        li.appendChild(document.createTextNode(str));
        ol.appendChild(li);
    }
}

function deleteEmployee(index) {
    index = parseInt(prompt('Select the employee you want to delete'));
    if (confirm("Are you delete employee " + index + " ?")) {
        employees.splice(index - 1, 1);
    }
    displayEmployee(employees);
}

function editEmployees() {
    index = parseInt(prompt('Select the employee you want to edit'));
    if (confirm("Are you edit employee " + index + " ?")) {
        editData();
        const employee = employees[index - 1];
        fullName.value = employee.fullName;
        identifyCard.value = employee.identifyCard;
        birthday.value = employee.birthday;
        email.value = employee.email;
        phone.value = employee.phone;
        level.value = employee.level;
        position.value = employee.position;
        department.value = employee.department;
    }
    employees.splice(index - 1, 1);
    displayEmployee(employees);
}

function detailEmployee() {
    $('ul').remove();
    index = parseInt(prompt('Select employee'));
    document.getElementById('detailEmployee').innerHTML += "<ul id = 'detailList'></ul>";
    let ul = document.getElementById("detailList");
    let employee = employees[index - 1];
    let str1 = 'Full Name: ' + employee.fullName;
    let str2 = 'Identify Card: ' + employee.identifyCard;
    let str3 = 'Birthday: ' + employee.birthday;
    let str4 = 'Email: ' + employee.email;
    let str5 = 'Phone: ' + employee.phone;
    let str6 = 'Level: ' + employee.level;
    let str7 = 'Position: ' + employee.position;
    let str8 = 'Department: ' + employee.department;
    let str9 = 'Salary: ' + employee.salary;
    let newArray = [];
    newArray.push(str1, str2, str3, str4, str5, str6, str7, str8, str9);
    for (let i = 0; i < newArray.length; i++) {
        let li = document.createElement("li");
        li.appendChild(document.createTextNode(newArray[i]));
        ul.appendChild(li);
    }
}

function change(id) {
    let img = document.getElementById(id).getAttribute('src');
    document.getElementById('img').setAttribute('src', img);
}

function cancelChange() {
    document.getElementById('img').remove();
    document.getElementById('imgMain').innerHTML += "<img style='position: absolute; margin-top: -100px'  id='img' src=''>"
}











