# Prosit 5: Programmation Orientée Objet (JAVA) - TuniProd

## Objectifs
- Dissocier la détection d’une anomalie de son traitement.
- Séparer la gestion des anomalies du reste du code.

Notre application rencontre des circonstances exceptionnelles pouvant compromettre la poursuite normale de son exécution, comme des données incorrectes. Pour assurer une exécution fiable, nous allons utiliser un mécanisme permettant de gérer ces situations exceptionnelles.

## Tâches
L’exercice repose sur l'utilisation de deux classes existantes : `Produit` et `Magasin`.

### Étapes
1. Dans la méthode `ajouterProduit`, qui permet d'ajouter un produit dans le magasin, supprimez les vérifications qui s’assurent que le magasin n’est pas plein.
2. Modifiez la taille maximale du tableau `produit` à 2.
3. Testez l’ajout de 3 produits dans la classe de test.
4. Observez le comportement et notez ce que vous remarquez.
5. Corrigez l'erreur en proposant une solution adaptée.
6. Créez une classe d'exception personnalisée `MagasinPleinException` pour gérer les situations où le magasin est plein. La méthode `ajouterProduit()` devra utiliser cette nouvelle exception.
7. Interdisez l’ajout d’un produit avec un prix négatif en levant une exception `PrixNegatifException` pour ce cas, afin de gérer cette situation de manière appropriée.

## Résultat attendu
L'application doit gérer les erreurs sans interrompre son exécution normale. Grâce aux exceptions `MagasinPleinException` et `PrixNegatifException`, les erreurs liées à la capacité du magasin et aux prix négatifs seront gérées efficacement.

--- 

**Note**: Assurez-vous de tester toutes les fonctionnalités et de valider que les exceptions sont bien levées et traitées dans les cas d’erreur.
