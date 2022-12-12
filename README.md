# Projet Spring Boot
<img src="https://raw.githubusercontent.com/iampavangandhi/iampavangandhi/master/gifs/Hi.gif" width="30px" height="50px">
  <strong> « Kaddem » , c’est quoi?:</strong> 
  
</h1>

>C’est un projet qui vise à encourager les jeunes étudiants à améliorer leurs compétences professionnelles notamment dans le cadre des nouvelles tendances du monde de l’informatique.
# Objectif:
>Dans le but de préparer les étudiants aux nouvelles exigences du marché d’emploi, nous proposons de travailler sur le projet « KADDEM ».
# Qu’est-ce-qu’on veut faire?
>-On désire créer une application de gestion des contrats d’étudiants dans le cadre du projet « Kaddem ».
-Ce projet définit dans chaque département des universités adhérentes un programme de répartition des étudiants par équipes.
-Chaque équipe aura l’un des niveaux (junior/senior ou expert) dans l’une des spécialités suivantes: IA, réseaux, sécurité, cloud.
-Ce projet propose donc aux étudiants des contrats selon la spécialité et le niveau.
-Chaque étudiant obtient un contrat s’il adhère à une équipe, Dans le cas ou il sera affecté à plusieurs équipe, il aura un contrat pour chaque activité avec une équipe.

-Le contrat constitue simplement un engagement moral entre l’étudiant et son université ➡️ il doit donc honorer son engagement en participant activement à l’évolution de son équipe.
# Etapes:

## 1-Créer les entités et les associations 
![diagrame](https://user-images.githubusercontent.com/61566287/200142880-1b3017a2-d828-4e7c-8ed2-36f071a10393.PNG)
![bd](https://user-images.githubusercontent.com/61566287/202925922-3182f4ef-f895-4f11-b80f-5b765f13fb6f.PNG)


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
  
  
  
## 4-Services avancés

>public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
![1](https://user-images.githubusercontent.com/61566287/202925440-42c0865a-6f40-4e75-976b-0f4429da5e0b.PNG)

>public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
  ![2](https://user-images.githubusercontent.com/61566287/202925513-2425b028-5e8a-4e3c-a49d-ca51824cf65f.PNG)
  
>Dans la base :
  
  ![1 2](https://user-images.githubusercontent.com/61566287/202925533-aeb739cf-b56c-4f0f-a168-533dfc544c85.PNG)
  
>List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
  ![3](https://user-images.githubusercontent.com/61566287/202925566-9d74fd15-3869-4350-83cc-0b87cc8662d6.PNG)
  
>public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
  ![4](https://user-images.githubusercontent.com/61566287/202925600-10f1fc03-0c65-42e2-a547-b445fec813c3.PNG)
  
>public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) ;
  ![5](https://user-images.githubusercontent.com/61566287/202925725-fdee5a66-c3ff-48b6-9ab3-6b1f35ecfc01.PNG)
  
>Integer nbContratsValides(Date startDate, Date endDate);
  ![6](https://user-images.githubusercontent.com/61566287/202925764-d34ec6fc-9865-4887-84aa-9816300715aa.PNG)
  
>Ajouter l'entité Experience :
  
  ![Untitled Diagram](https://user-images.githubusercontent.com/61566287/204134790-1319ac22-6d64-4618-9fad-f873b140bbd8.png)
  
>Crud :
  
![223](https://user-images.githubusercontent.com/61566287/204231529-b659bf74-41d6-46c7-bfef-514a7160dd97.PNG)

>Search RequestParam :


![Capture d’écran (28)](https://user-images.githubusercontent.com/61566287/206903496-72dc8ee8-d3e0-4d1d-93f7-87304fb3b199.png)
  
>Search PathParam:
  
![Capture d’écran (29)](https://user-images.githubusercontent.com/61566287/206903529-8a37938a-12e3-45b4-af44-f1f73e154ed4.png)
  
>Pagination :
  
![Capture d’écran (30)](https://user-images.githubusercontent.com/61566287/206903566-c2215669-43ca-4340-9ef8-026e8e676949.png)
  
>PDF :
  
  
>Excel :





  








  
