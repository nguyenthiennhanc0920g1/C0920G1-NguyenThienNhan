class Customer {
    constructor(name, id, phoneNumber, email, address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }
}

let customers = []; // Array Customer

let fullName = document.getElementById('inName');
let identifyCard = document.getElementById('inIdCard');
let phone = document.getElementById('inPhone');
let email = document.getElementById('inEmail');
let address = document.getElementById('inAddress');

function displayCustomer() {
    let ol = document.getElementById("list");
    $('li').remove();
    for (let i = 0; i < customers.length; i++) {
        let customer = customers[i];
        let str = customer.name + "-" + customer.id;
        let li = document.createElement("li");
        li.appendChild(document.createTextNode(str));
        ol.appendChild(li);
    }
}

function finish() {
    let customer = new Customer(fullName.value, identifyCard.value, phone.value, email.value, address.value);
    customers.push(customer);
    console.log(customers);
    displayCustomer();
}

function detailCustomer(customer) {
    $('ul').remove();
    document.getElementById('detailCustomer').innerHTML += "<ul id = 'detailList'></ul>";
    let ul = document.getElementById("detailList");
    let str1 = 'Full Name: ' + customer.name;
    let str2 = 'Identify Card: ' + customer.id;
    let str3 = 'Phone Number: ' + customer.phoneNumber;
    let str4 = 'Email: ' + customer.email;
    let str5 = 'Address: ' + customer.address;
    let newArray = [];
    newArray.push(str1, str2, str3, str4, str5);
    for (let i = 0; i < newArray.length; i++) {
        let li = document.createElement("li");
        li.appendChild(document.createTextNode(newArray[i]));
        ul.appendChild(li);
    }
}

function search() {
    let searchName = prompt('Input name customer want to search:');
    let check = false;
    //let customer = "";
    for (let i = 0; i < customers.length; i++) {
        var customer = customers[i];
        console.log(customer);
        let nameCus = customer.name;
        if (searchName === nameCus) {
            check = true;
        }
    }
    if (check === true) {
        detailCustomer(customer);
    } else {
        alert('DO NOT HAVE CUSTOMER');
    }
}

