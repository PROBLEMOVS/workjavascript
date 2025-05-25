let number =(prompt("Введіть число"));
if (insnan(number)|| number <1){
    alert("Будь ласка, введіть коректне число більше або рівне 1.");
   }else {
    let sum =0;
    for (let i =1;i <=number; i++){
        sum+=1;
        }
        aler("Сума чисел від 1 до" + number + "Дорівнює" + sum);
        }