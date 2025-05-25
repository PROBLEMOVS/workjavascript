
let height =parseint (prompt("Введіть висоту рівнобедреного трикутника:"));
if(isnan(height)||height <1){
    alert("Будь ласка введіть коректне ціле число більше нуля");
    }else{
        for(leti=1;i<=height;i++){
            let spaces ='&nbsp'.repeat(height-1);
            let stars ='*'.repeat(2*i-1);
            Document.write(spaces+stars+"<br>");
            }
            }