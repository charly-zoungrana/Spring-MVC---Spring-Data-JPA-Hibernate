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
🌐 **Accès**: http://localhost:8085

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

