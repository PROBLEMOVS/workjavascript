const num1=parseint(prompt("Введіть перше множення(від 1 до 10):"));
const num2=parseint(prompt("Введіть друге множення(від 1 до 10):"));
if(!isnan(num1)&& !isnan (num2)&& num1 >= 1 && num1 <= 10 && num2 >= 1 && num2<=10){
    Document.write(!`${num1} x % {num2}=%{num1*num2}`);
   }else{
Document.write("Error! Повторіть числа від 1 до 10");
}

