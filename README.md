# Teaching-HEIGVD-AMT-2019-Project-Two

## Lancer le projet
Afin de générler le million d'insertion dans la base de données il vous faudra lancer les commandes suivantes 

```
python main.py db_flight_dump.sql --rows 1000000 --output ../images/database/data-flight/flights.sql
python main.py db_user_dump.sql --rows 1000000 --output ../images/database/data-user/users.sql
```

Afin de lancer le projet il vous faudra lancer la commande suivante 

```
docker-compose up --build
```
Ainsi les différents éléments de notre infrastructure vont se lancer et se lier. Vous pourrez suite à ça accéder à l'adresse afin d'accéder à l'interface de Traefik, vous pourrez depuis ici utiliser nos APIs
```
http://localhost:1234
```
Afin de lancer les tests il faudra lancer la commande

```
TODO
```

## Table des matières

[Aspect fonctionnel](https://github.com/IxSysTech/TrainingREST/blob/master/rapport/functional_aspect.md)

[Détail d'implémentation](https://github.com/IxSysTech/TrainingREST/blob/master/rapport/detail.md)

[Test](https://github.com/panticne/Teaching-HEIGVD-AMT-2019-Project-One/blob/master/markdowns/test.md)

[Performance](https://github.com/panticne/Teaching-HEIGVD-AMT-2019-Project-One/blob/master/markdowns/test.md)

[Bug](https://github.com/panticne/Teaching-HEIGVD-AMT-2019-Project-One/blob/master/markdowns/test.md)
