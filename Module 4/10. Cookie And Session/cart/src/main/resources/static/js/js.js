function getTotal() {
   let price = document.getElementById("price").value;
   let quantity = document.getElementById("quantity").value;
   document.getElementById("total").innerHTML = quantity;
   alert(quantity);
}