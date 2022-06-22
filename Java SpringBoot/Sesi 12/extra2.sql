SELECT d.dependent_name, d.relationship, fname FROM dependent d JOIN employee e ON e.ssn = d.essn WHERE e.fname LIKE 'y%' OR e.fname LIKE 'Y%';

SELECT e.fname, w.pnum AS "TOTAL PROJECT" FROM works_on w JOIN employee e ON e.ssn = w.essn WHERE w.pnum = 1;

SELECT COUNT(ssn) FROM employee WHERE salary > 3500000;

SELECT COUNT(pnumber), pname FROM project WHERE pnum = 2;

SELECT SUM(e.salary), AVG(e.salary), d.dname AS "DEPARTMENT" FROM department d JOIN employee e ON d.dnumber = e.dnum GROUP BY d.dname;  

SELECT COUNT(e.ssn), d.dname AS "DEPARTMENT" FROM department d JOIN employee e ON d.dnumber = e.dnum GROUP BY d.dname ORDER BY COUNT(e.ssn) ASC;  

SELECT COUNT(hours), p.pname AS "PROJECT" FROM works_on w JOIN project p ON p.pnumber = w.pnum GROUP BY p.pname; 

SELECT SUM(w.hours) AS "TOTAL KERJA", e.fname AS "NAMA" FROM works_on w JOIN employee e ON e.ssn = w.essn GROUP BY e.ssn HAVING SUM(w.hours) > 140 ORDER BY SUM(w.hours) DESC; 

SELECT e.fname, CASE WHEN SUM(w.hours) >= 200 THEN '50%' WHEN SUM(w.hours) >= 150 AND SUM(W.HOURS) < 200 THEN '20%' ELSE '10%' END BONUS FROM works_on w JOIN employee e ON w.essn = e.ssn GROUP BY w.essn, e.fname;

SELECT COUNT(p.pnumber) AS "TOTAL PROJECT", e.fname AS "NAMA" FROM project p JOIN employee e ON e.dnum = p.dnum GROUP BY e.ssn ORDER BY COUNT(p.pnumber) DESC; 

SELECT COUNT(p.pnumber) AS "TOTAL PROJECT", e.fname AS "NAMA" FROM project p JOIN employee e ON e.dnum = p.dnum GROUP BY e.ssn HAVING COUNT(p.pnumber) > 4 ORDER BY COUNT(p.pnumber) DESC; 

SELECT AVG(w.hours) AS "TOTAL KERJA", e.fname AS "NAMA", COUNT(p.pnumber) FROM works_on w JOIN employee e ON e.ssn = w.essn JOIN project p ON e.dnum = p.dnum GROUP BY e.ssn HAVING AVG(w.hours) > 70 AND COUNT(p.pnumber) > 2 ORDER BY AVG(w.hours) DESC;  

SELECT COUNT(relationship), relationship AS "TOTAL DEPENDANT" FROM dependent GROUP BY relationship;
 
SELECT AGE(mgrstartdate), dname FROM department;  

SELECT p.plocation, COUNT(p.plocation) FROM project p JOIN department d ON p.dnum = d.dnumber GROUP BY p.plocation HAVING COUNT(p.plocation) >= 2;  