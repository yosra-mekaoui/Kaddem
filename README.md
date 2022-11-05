# Etapes:

## 1-Créer les entités et les associations 
![diagrame](https://user-images.githubusercontent.com/61566287/200142880-1b3017a2-d828-4e7c-8ed2-36f071a10393.PNG)

## 2-Créer les services
## Créer les CRUD des différentes entités
![se](https://user-images.githubusercontent.com/61566287/200142960-bd06a05a-6754-4162-a71e-d611bdb8470b.PNG)
### Exemple
>Entité Etudiant

List<Etudiant> retrieveAllEtudiants();

Etudiant addEtudiant (Etudiant e);

Etudiant updateEtudiant (Etudiant e);

Etudiant retrieveEtudiant(Integer idEtudiant);

void removeEtudiant(Integer idEtudiant);

## 3-Spring MVC REST
>Exposer les services implémentés avec Postman et/ou Swagger pour les tester.
  ### Exemple
 >Afficher liste les Etudiants :
![1](https://user-images.githubusercontent.com/61566287/200143161-32bf16be-2315-4082-89db-9af7b9eb0c18.PNG)
  >Ajouter Etudiant :
  ![2](https://user-images.githubusercontent.com/61566287/200143186-c9bf3c73-e0d9-44db-9674-779aa1a4ff20.PNG)
  >Modifier Etudiant :
![3](https://user-images.githubusercontent.com/61566287/200143190-2fa56578-667d-412b-a4a4-bde4f0c2f5be.PNG)
  >Afficher Etudiant By id : 
![4](https://user-images.githubusercontent.com/61566287/200143193-2e60a4e6-9392-48a8-b93c-35f842a8bf25.PNG)
  >Supprimer Etudiant :
![5](https://user-images.githubusercontent.com/61566287/200143201-b2b9d857-f30d-4658-9099-bfdc5047baf2.PNG)


  
