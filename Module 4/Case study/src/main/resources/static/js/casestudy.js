let fullName = document.getElementById('name');
let address = document.getElementById('address');
let modal = document.getElementById('id01');
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
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}