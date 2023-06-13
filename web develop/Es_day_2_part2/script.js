function modificaParagrafo(){
    document.getElementById('paragrafo').innerHTML = 'mondo';
}

function modificaSrc(){
    var image = document.getElementById('meme');
    image.src = "https://tinyurl.com/mw9dhx2t";
}

function riempi(){
    const rows = document.getElementsByTagName("tr");
    for (let i = 0; i < rows.length; i++) {
        let row = rows[i];
        row.cells[i].innerHTML = 'a';
      }
}
function go() {
    const arrayUrl = ["https://i.imgflip.com/7oyvec.jpg",
                      "https://i.imgflip.com/7mozl6.jpg",
                      "https://i.imgflip.com/7p1d2q.jpg",
                      "https://i.imgflip.com/7p0fmp.jpg",
                      "https://i.imgflip.com/7oyvec.jpg",
                      "https://i.imgflip.com/7p48ta.jpg",
                      "https://i.imgflip.com/7p1284.jpg",
                      "https://i.imgflip.com/7p1kff.jpg",
                      "https://i.imgflip.com/7p1cee.jpg"];
    const images = document.getElementsByTagName("img");
    for (let index = 0; index < images.length; index++) {
        const element = images[index];
        element.src = arrayUrl[index];
        element.style.width = "50%"
    }
}