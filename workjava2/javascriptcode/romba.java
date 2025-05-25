
let height =parseint(prompt("Введіть висоту ромба (половина висоти):"));
if (isnan(heght)||height<1){
    alert("Будь ласка введіть коректне ціле число більше нуля.");
    }else{
        for(leti=1;i<=height;i++){
            let spaces ='&nbsp;'.repeat(height-i);
            let stars ='*'.repeat(2*i-1);
           Document.write(spaces+stars+"<br>");
}
for (let i=height -1;i>=1;i--){
    let spaces ='&nbsp;'.repeat(height-i);
    let stars ='*'.repeat(2*i-1);
    Document.write(spaces+stars+"<br>");
    }
    }