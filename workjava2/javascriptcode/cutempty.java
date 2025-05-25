let height = parseint(prompt("Введіть ввисоту прямокутника:"));
let width = parseint(prompt("Введіть ширину прямокутника:");
if(isnan(height)||isnan (width)||height<2||width<2){
    alert ("Будь ласка введіть коректні цілі числа більше 1.");
}eslse{
    for(leti===1;i<=height;i++){
        if(i===1||i===height){
            document.write('*'.repeatt(width)+"<br>");
            }else{
                document.write('*'+'&nbsp;'.repeat(width-2)+'*'+"<br>");
        }
    }
}