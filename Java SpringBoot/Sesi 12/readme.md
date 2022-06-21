a) Tampilkan dependent_name dan relationship dengan employee yang namanya diawali huruf R ?
Syntax : select * dependent_name, FName from employee -> where FName like 'R';
===========================================================

 b) Banyaknya employee yang mengerjakan project PNum = 1 ? 
SELECT employee FROM employee WHERE PNum = 1;
===========================================================

c) Banyaknya employee yang memiliki salary lebih dari 3500000 ? 
select count(ssn) from employee where salary > 3500000;
===========================================================

d) Banyaknya project yang dikerjakan DNum =2 ? 
Syntax :  
select count(pnumber) from project where dnum = 2;

===========================================================

e) Hitung total dan rata-rata salary dari setiap departemen ?
Syntax : 
===========================================================

f) Banyaknya employee dari setiap department dan urutkan berdasarkan employee terbanyak ? 

SYNTAX : 
SELECT Dnum, sum(Salary), AVG(Salary) FROM Employee
GROUP BY DNum
ORDER BY DNum ASC;

===========================================================
g) Total hours perweek dari semua employee untuk setiap project ?



===========================================================
 h) Employee yang memiliki total hours perweek lebih besar dari 140 hours dan urutkan berdasarkan jumlah jam kerja terbanyak? 


===========================================================

 i) Kelompokkan bonus employee berdasarkan jumlah jam kerjanya ? (Jika >= 200 hours, maka bonus = 50%; Jika >= 150 hours, maka bonus = 25%, Selainnya bonus = 10%) 

 ===========================================================
 j) Banyaknya project yang dikerjakan tiap employee dan urutkan dari yang terbanyak ? 
 k) Employee yang bekerja pada 4 project ? 
 l) Employee yang memiliki rata-rata hours perweek = 70 jam dan bekerja pada 2 project ? 
 m) Banyaknya Dependent berdasarkan relationship dengan employee ? n) Berapa lama Manager tiap Department sudah menjabat ? 
 o) Lokasi project yang menjadi tempat lebih dari satu department?