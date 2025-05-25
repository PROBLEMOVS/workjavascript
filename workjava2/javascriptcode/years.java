
var years = parseint(prompt("Введіть ваш вік"))
     if (IsNan(years)) {
      document.write('ВВедіть ваш вік');

        }else if (age>=0&&age<12){
Document.write('Дитина' + years);
            }else if (age>=12&&age<18){
Document.write('Підліток' + years);
            }else if(age>=18&&age<60){
               document.write('Дорослий'+ years);
               }else if (age>=60) {
                document.write('Пенсіонер' + years);
                }else{
                    console.log('Error');
                   } 

