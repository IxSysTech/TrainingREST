# Functional Aspect

Nous avons implémenté l'API User comme demandé dans la consigne initiale, donc ce n'est pas celle-ci que nous détaillerons ici. Nous allons nous attarder
sur le fonctionnement de notre seconde API

## API flight
Nous avons ici décidé de reprendre un business domain un peu similaire au Projet One mais en l'adaptant un petit peu à la donnée de ce laboratoire
Notre but est de fournir à un passager la possibilité de réserver/gérer un vol.

Un passager a donc la possibilité d'obtenir tous ses vols, en supprimer un, en ajouter un. Si le passager est supprimé, tous ses vols le sont aussi. Pareil pour un vol, il n'existe aucune réservation de vol si le vol n'existe pas. Les opérations CRUDs ont été implémentées sur chaque main entities, ce qui permet donc l'ajout, la suppression, la modification et la lecture de ces éléments.

//TODO ADD IMAGE SCHEMA
