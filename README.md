# 🚀 Projets JEE Spring Boot - Gestion Complète

<div align="center">

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-green?style=for-the-badge&logo=spring-boot)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-blue?style=for-the-badge&logo=thymeleaf)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6.2-blue?style=for-the-badge&logo=spring-security)
![Hibernate](https://img.shields.io/badge/Hibernate-6.4-brown?style=for-the-badge&logo=hibernate)
![H2 Database](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge&logo=h2)

</div>

## 📋 Description

Ce dépôt contient **deux applications JEE complètes** développées dans le cadre d'une activité pratique sur Spring Boot. Ces projets démontrent la maîtrise des technologies modernes de développement d'applications web Java.

---

## 🏗️ Architecture des Projets

### 📦 1. Product Management - Application E-commerce
Une application complète de gestion de produits avec authentification et autorisation.

```
productManagement/
├── 📁 src/main/java/com/charly/productmanagement/
│   ├── 🏢 entity/Product.java              # Entité JPA avec validation
│   ├── 📂 repository/ProductRepository.java # Spring Data JPA
│   ├── 🎮 web/ProductController.java       # Contrôleur MVC
│   └── 🔐 security/SecurityConfig.java     # Configuration Spring Security
└── 📁 src/main/resources/
    ├── 📄 application.properties           # Configuration H2
    └── 📁 templates/                       # Vues Thymeleaf
```

### 🏥 2. Hospital - Système de Gestion Hospitalière
Un système complet pour gérer patients, médecins, rendez-vous et consultations.

```
Hospital/
├── 📁 src/main/java/com/charly/hospital/
│   ├── 🏢 entities/                        # Entités JPA
│   │   ├── Patient.java                   # Patient avec rendez-vous
│   │   ├── Medecin.java                   # Médecin avec spécialités
│   │   ├── RendezVous.java                # Rendez-vous avec statuts
│   │   └── Consultation.java              # Consultations médicales
│   ├── 📂 repositories/                   # Spring Data JPA
│   ├── 🎮 web/PatientRestController.java   # API REST
│   └── 🛠️ service/                        # Couche métier
│       └── PatientService.java            # Service pour les patients
```

---

## 🎯 Fonctionnalités Implémentées

### 🛍️ Product Management

| Fonctionnalité | Description | Technologie |
|---------------|-------------|-------------|
| 🔍 **Recherche** | Recherche de produits par nom | Spring Data JPA |
| ➕ **Création** | Ajout de produits avec validation | Bean Validation |
| ✏️ **Édition** | Mise à jour des produits existants | Spring MVC |
| 🗑️ **Suppression** | Suppression sécurisée des produits | Spring Security |
| 🔐 **Authentification** | Login/logout avec rôles | Spring Security |
| 👥 **Autorisation** | Rôles USER/ADMIN avec restrictions | Spring Security |
| 📊 **Dashboard** | Interface moderne avec Bootstrap | Thymeleaf + Bootstrap 5 |

### 🏥 Hospital Management

| Entité | Relations | Fonctionnalités |
|--------|-----------|----------------|
| 👤 **Patient** | 1-N → RendezVous | CRUD complet |
| 👨‍⚕️ **Médecin** | 1-N → RendezVous | Gestion des spécialités |
| 📅 **Rendez-vous** | N-1 Patient/Médecin, 1-1 Consultation | Statuts (PENDING, COMPLETED, CANCELED) |
| 🩺 **Consultation** | 1-1 Rendez-vous | Rapports médicaux |

---



## 🚀 Démarrage Rapide

### 📥 Étape 1: Cloner le Dépôt

```bash
# Cloner le dépôt
git clone git@github.com:charly-zoungrana/Spring-MVC---Spring-Data-JPA-Hibernate.git

# Entrer dans le répertoire
cd "activite pratique 2"
```

### ⚙️ Étape 2: Prérequis
```bash
☕ Java 21+
📦 Maven 3.6+
```

### 🛍️ Étape 3: Lancer Product Management
```bash
cd productManagement
mvn spring-boot:run
```
🌐 **Accès**: http://localhost:8085

### 🏥 Étape 4: Lancer Hospital
```bash
cd Hospital
mvn spring-boot:run
```
🌐 **Accès**: http://localhost:8080

---

## 🔐 Identifiants de Connexion

| Role | Username | Password |
|------|----------|----------|
| 👤 User | user1 | 1234 |
| 👤 User | user2 | 1234 |
| 👑 Admin | admin | 1234 |

---

### 🛍️ Product Management
- **Page d'accueil**: Liste des produits avec recherche
- **Formulaire d'ajout**: Validation en temps réel
- **Interface admin**: Contrôles complets CRUD

### 🏥 Hospital Management
- **API REST**: Endpoints pour la gestion des patients
- **Modèle de données**: Relations complexes entre entités

---

## 🎨 Points Forts du Projet

### ✅ Architecture Robuste
- **Pattern MVC** bien structuré
- **Séparation des responsabilités** claire
- **Code propre** avec Lombok

### 🔒 Sécurité Avancée
- **Authentification** par formulaire
- **Autorisation** basée sur les rôles
- **Protection CSRF** activée
- **Pages d'erreur** personnalisées

### 🎯 UX/UI Moderne
- **Responsive Design** avec Bootstrap
- **Layouts** réutilisables
- **Feedback utilisateur** immédiat
- **Navigation intuitive**

### 📊 Base de Données
- **JPA/Hibernate** optimisé
- **Relations** bien définies
- **Console H2** pour le débuggage

---

## 🧪 Tests et Validation

### Tests Intégrés
```bash
mvn test                    # Tests unitaires
mvn integration-test        # Tests d'intégration
```

### Validation des Formulaires
- **Annotations Bean Validation**
- **Messages d'erreur** personnalisés
- **Validation côté client et serveur**

---

## 🚀 Évolutions Possibles

### 📈 Features à Ajouter
- [ ] **Pagination** des listes
- [ ] **Export CSV/PDF** des données
- [ ] **Notifications** en temps réel
- [ ] **Upload d'images** pour les produits
- [ ] **Dashboard analytics** avec graphiques

### 🔧 Améliorations Techniques
- [ ] **Dockerisation** des applications
- [ ] **CI/CD** avec GitHub Actions
- [ ] **Tests automatisés** avec Selenium
- [ ] **Monitoring** avec Spring Actuator

---

## 📚 Ressources Pédagogiques

Ces projets sont basés sur les tutoriels vidéo suivants :
- 🎥 [Gestion des Produits](https://www.youtube.com/watch?v=FHy7raIldgg)
- 🎥 [Système Hospitalier Part 1](https://www.youtube.com/watch?v=Kfv_7m8INlU)
- 🎥 [Système Hospitalier Part 2](https://www.youtube.com/watch?v=s6p2dE3qrsU)

---

## 🤝 Contribution

Ce projet est une **activité pédagogique** mais les contributions sont bienvenues !

1. Fork ✨
2. Créer une branche (`git checkout -b feature/AmazingFeature`)
3. Commit (`git commit -m 'Add some AmazingFeature'`)
4. Push (`git push origin feature/AmazingFeature`)
5. Ouvrir une Pull Request 🎉

---

## 📄 Licence

Ce projet est sous licence **MIT** - voir le fichier [LICENSE](LICENSE) pour plus de détails.

---

## 👨‍💻 Auteur

**Charly Zoungrana**
- 📧 Email: [votre-email@example.com]
- 🎓 Étudiant GLSID-S4
- 📍 JEE-Middlewares

---

<div align="center">

⭐ **N'hésitez pas à laisser une étoile si ce projet vous a été utile !** ⭐

Made with ❤️ by [Charly Zoungrana](https://github.com/charly-zoungrana)

</div>
