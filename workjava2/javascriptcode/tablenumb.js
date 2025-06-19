
let height = parseInt(prompt("Введіть висоту прямокутного трикутника:"));
if (!isNaN(height) && height > 0) {
    for (let i = 1; i <= height; i++) {
        let row = "";  
        for (let a = 1; a <= i; a++) {
            row += "*";  
        }
        document.write(row + "<br>");  
    }
} else {
    document.write("Помилка! Введіть додатне число.");
}
