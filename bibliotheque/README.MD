## [ARI] Back-end Project

### Présentation :	

La partie serveur de mon application est donc en **Spring Boot** et utilise pour la persistance des données une base H2. L'application se divise en 4 paquets différents, Author, Book, ainsi que Reader qui représente les entités de l'application. Et pour finir un paquet Exceptions qui regroupe les exceptions pouvant être lancées.

### Prérequis :

Pour ce qui est de l'installation côté back il faut simplement avoir la commande **nvm** d'installer. Si vous n'avez pas déjà **Maven** d'installer vous pouvez trouver un exécutable d'installation [ici](https://maven.apache.org/download.cgi).

### Installation & Lancement :

Une fois **Maven** installé vous aurait à disposition les commandes **mvn** qui permet entre autres d'installer les dépendances du projet, de le build et de lancer les tests.  

`mvn clean install` 

Une fois les dépendances installées vous pouvez build le projet avec la commande

`mvn build` 

Ou l'ouvrir dans l'IDE de votre choix pour le démarrer. Veillez néanmoins à lancer le projet avec la configuration décrite dans le fichier **application.properties** qui se situe dans le dossier **resources**.  
