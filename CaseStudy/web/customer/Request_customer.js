// TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2 TASK 1 & TASK 2
let customers = []; // Array Customer

let fullName = document.getElementById('inName');
let identifyCard = document.getElementById('inIdCard');
let birthday = document.getElementById('inBirth');
let email = document.getElementById('inEmail');
let address = document.getElementById('inAddress');
let customerType = document.getElementById('inCustomer');
let discount = document.getElementById('inDiscount');
let quantityInclude = document.getElementById('inQuantity');
let rentDays = document.getElementById('inRentDay');
let typeOfService = document.getElementById('inService');
let typeOfRoom = document.getElementById('inRoom');
let totalPay = document.getElementById('pay');

function checkData() {

    document.getElementById('outName').innerHTML = fullName.value;
    document.getElementById('outIdCard').innerHTML = identifyCard.value;
    //document.getElementById('outBirth').innerHTML = birthday.value;
    document.getElementById('outEmail').innerHTML = email.value;
    document.getElementById('outAddress').innerHTML = address.value;
    document.getElementById('outCustomer').innerHTML = customerType.value;
    document.getElementById('outDiscount').innerHTML = discount.value;
    document.getElementById('outQuantity').innerHTML = quantityInclude.value;
    document.getElementById('outRentDay').innerHTML = rentDays.value;
    document.getElementById('outService').innerHTML = typeOfService.value;
    document.getElementById('outRoom').innerHTML = typeOfRoom.value;

    document.getElementById('post').style.display = "none";
    document.getElementById('sidebar').style.display = "block";
}

function editData() {
    document.getElementById('sidebar').style.display = "none";
    document.getElementById('post').style.display = "block";
}

function total() {
    //Address Discount
    let subsAddress = ['Da Nang', 'Đà Nẵng', 'Danang', 'Hue', 'Huế', 'Quang Nam', 'Quảng Nam', 'Quangnam'];
    let addressDiscount;
    if (address.value.includes(subsAddress[0]) || address.value.includes(subsAddress[1]) || address.value.includes(subsAddress[2])) {
        addressDiscount = 20;
    } else if (address.value.includes(subsAddress[3]) || address.value.includes(subsAddress[4])) {
        addressDiscount = 10;
    } else if (address.value.includes(subsAddress[5]) || address.value.includes(subsAddress[6]) || address.value.includes(subsAddress[7])) {
        addressDiscount = 5;
    } else {
        addressDiscount = 0;
    }
    // Customer Discount
    let subsService = ['Diamond', 'Platinum', 'Gold', 'Silver', 'Member'];
    let customerDiscount;
    if (customerType.value.includes(subsService[0])) {
        customerDiscount = 15;
    } else if (customerType.value.includes(subsService[1])) {
        customerDiscount = 10;
    } else if (customerType.value.includes(subsService[2])) {
        customerDiscount = 5;
    } else if (customerType.value.includes(subsService[3])) {
        customerDiscount = 2;
    } else if (customerType.value.includes(subsService[4])) {
        customerDiscount = 0;
    } else {
        customerDiscount = 0;
    }
    //Rent Day Discount
    let rentDaysDiscount;
    if (rentDays.value >= 7) {
        rentDaysDiscount = 30;
    } else if (rentDays.value >= 5) {
        rentDaysDiscount = 20;
    } else if (rentDays.value >= 2) {
        rentDaysDiscount = 10;
    } else {
        rentDaysDiscount = 0;
    }
    // Type of service
    let moneyService = ['Villa ($500/day)', 'House ($300/day)', 'Room ($100/day)'];
    let service;
    if (typeOfService.value.includes(moneyService[0])) {
        service = 500;
    } else if (typeOfService.value.includes(moneyService[1])) {
        service = 300;
    } else if (typeOfService.value.includes(moneyService[2])) {
        service = 100;
    } else {
        service = 0;
    }
    //Total pay
    let discountPay = addressDiscount + rentDaysDiscount + customerDiscount;
    let totalPay = service * rentDays.value - discountPay;
    document.getElementById('pay').innerHTML = totalPay + '$';
}

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
    let dd = arrBirth[2];
    let mm = arrBirth[1];
    let yyyy = arrBirth[0];
    document.getElementById('outBirth').innerHTML = dd + '/' + mm + '/' + yyyy;
}

//Name + Address Format
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
    const customer = {
        fullName: fullName.value,
        identifyCard: identifyCard.value,
        birthday: birthday.value,
        email: email.value,
        address: address.value,
        customerType: customerType.value,
        discount: discount.value,
        quantityInclude: quantityInclude.value,
        rentDays: rentDays.value,
        typeOfService: typeOfService.value,
        typeOfRoom: typeOfRoom.value,
        totalPay: totalPay.innerHTML,
    };
    customers.push(customer);
    console.log(customers);
    displayCustomer();
    editData();
}

function displayCustomer() {
    let ol = document.getElementById("list");
    $('li').remove();
    for (let i = 0; i < customers.length; i++) {
        let customer = customers[i];
        let str = customer.fullName + "-" + customer.identifyCard;
        let li = document.createElement("li");
        li.appendChild(document.createTextNode(str));
        ol.appendChild(li);
    }
}

function deleteCustomer(index) {
    index = parseInt(prompt('Select the customer you want to delete'));
    if (confirm("Are you delete customer " + index + " ?")) {
        customers.splice(index - 1, 1);
    }
    displayCustomer(customers);
}

function editCustomers() {
    index = parseInt(prompt('Select the customer you want to edit'));
    if (confirm("Are you edit customer " + index + " ?")) {
        editData();
        const customer = customers[index - 1];
        fullName.value = customer.fullName;
        identifyCard.value = customer.identifyCard;
        birthday.value = customer.birthday;
        email.value = customer.email;
        address.value = customer.address;
        customerType.value = customer.customerType;
        discount.value = customer.discount;
        quantityInclude.value = customer.quantityInclude;
        rentDays.value = customer.rentDays;
        typeOfService.value = customer.typeOfService;
        typeOfRoom.value = customer.typeOfRoom;
    }
    customers.splice(index - 1, 1);
    displayCustomer(customers);
}

function detailCustomer() {
    $('ul').remove();
    index = parseInt(prompt('Select customer'));
    document.getElementById('detailCustomer').innerHTML += "<ul id = 'detailList'></ul>";
    let ul = document.getElementById("detailList");
    let customer = customers[index - 1];
    let str1 = 'Full Name: ' + customer.fullName;
    let str2 = 'Identify Card: ' + customer.identifyCard;
    let str3 = 'Birthday: ' + customer.birthday;
    let str4 = 'Email: ' + customer.email;
    let str5 = 'Address: ' + customer.address;
    let str6 = 'Customer Type: ' + customer.customerType;
    let str7 = 'Discount: ' + customer.discount;
    let str8 = 'Quantity Include: ' + customer.quantityInclude;
    let str9 = 'Rent Days: ' + customer.rentDays;
    let str10 = 'Type Of Service: ' + customer.typeOfService;
    let str11 = 'Type Of Room: ' + customer.typeOfRoom;
    let str12 = 'Total Pay: ' + customer.totalPay;
    let newArray = [];
    newArray.push(str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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











