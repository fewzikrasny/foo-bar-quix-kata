### Pré-requis :

Les logiciels suivants doivent être installés sur votre machine :

- [Node.js](https://nodejs.org/) et npm (au minimum node v 10.x et npm 5.x).
- Maven 3
- Java 8

### Instructions :

  - Télécharger l'ensemble du projet
  - Démarrer la partie back dans foobarquix-back : 
  ```bash
  mvn spring-boot:run
  ```
  - Installer bootstrap si non installé dans foobarquix-ui : 
  ```bash
  npm install bootstrap@3 --save
  ```
  - Démarrer la partie front dans foobarquix-ui : 
  ```bash
  npm run start
  ```
  - Les instructions du kata se trouvent ensuite  [ici](http://localhost:4200/) 
  
  ### Extension :
For the extension of the project and the addition of new dividers and correspondences just modify the application.properties in foo-bar-quix back :
- map.divisors-keys for dividers
- map.correspondences-values ​​for correspondences  

