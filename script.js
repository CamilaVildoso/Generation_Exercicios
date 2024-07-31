document.querySelector('form').onsubmit = function(event) {
    const nome = document.querySelector('input[name="nome"]').value;
    const email = document.querySelector('input[name="mail"]').value;
    if (nome === '' || email === '') {
        alert('Por favor, preencha todos os campos.');
        event.preventDefault();
    }
}

const header = document.querySelector('header');
header.onmouseover = function() {
    header.style.backgroundImage = "url('./img/portada2.jpg')";
}
header.onmouseout = function() {
    header.style.backgroundImage = "url('./img/portadaHelloKitty.jpg')";
}