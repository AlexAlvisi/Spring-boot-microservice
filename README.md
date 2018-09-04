# Spring-boot-microservice

Istruzioni per avviare il programma e creare il db e le tabelle:

1. Avviare XAMPP
2. Aprire il Pannello di controllo
3. Avviare i server MySQL e Apache dal control Panel
4. Aprire il browser
5. Andare su localhost/phpmyadmin nella barra degli indirizzi
6.  Creare un database e chiamarlo "coupondb" 
7. Andare nella sezione "Importa"
8. Importare il file "coupondb_coupon.sql"
9. Salvare
10. Il database è correttamente importato

Aprire un IDE(si consiglia IntellijIdea)
Importare Account Microservice e Coupon Microservice

Account Microservice usa un DB H2 in-memory per salvare i dati:
Struttura db H2(il DB H2 viene automaticamente settato in pom.xml e quindi non c'è bisogno di crearlo):

TABLE users      (String ID, String USERNAME, String PASSWORD, String PERMISSION) 

TABLE accounts   (String ID, String FK_USER, Double TOTAL) 

TABLE operations (String ID, Date DATE, Double VALUE, String DESCRIPTION, String FK_ACCOUNT1, String FK_ACCOUNT2)

Il secondo microservizio Coupon Microservice usa un DB in MySql, username:root. password vuota, e si collega sulla porta 3306 al DB coupondb


