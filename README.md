# Lumindex 📸 AI Photo Index & SNS Sharing Application

## 1. Project Overview
**Lumindex** is an AI-powered photo management application that automatically analyzes photos from users' devices. It generates tags for people, places, and memorable moments using advanced AI/LLM models (backend TBD). The generated tags and photos can be searched efficiently and shared to social platforms such as Instagram and Facebook.

**Main Objectives:**
- Automatic photo tagging and indexing
- Optimized large-scale photo search
- SNS sharing capabilities
- Learning experience for read/write traffic separation using the CQRS pattern
- UX/UI implementation TBD (backend-focused portfolio project)

---

## 2. Core Features

| Feature | Description | Technology Stack |
| --- | --- | --- |
| Photo Upload | Upload photos from mobile devices to the server | REST API (Frontend TBD) |
| AI Analysis & Tag Generation | Extract people, locations, and memories | AI/LLM TBD |
| Photo Storage | Store original photos + AI-generated tags (URL stored in DB; storage backend TBD) | Spring Boot + JPA + MySQL (Master) |
| Search & Autocomplete | Search by tags, names, or memories | ElasticSearch, Redis |
| SNS Sharing | Upload photos + tags to Instagram/Facebook | Instagram Graph API, Facebook API (Frontend TBD) |

---

## 3. Architecture & Data Flow

### Data Flow
1. **Photo Upload:** Users select photos → upload to server (Frontend TBD)
2. **AI/LLM Analysis:** Photos analyzed → automatic tags generated (backend TBD)
3. **Command (Write):** Store photos + tags in Master MySQL DB; handle add/update/delete (backend storage TBD)
4. **Query (Read):** Read operations use Slave MySQL DB; index in ElasticSearch / Redis; provide tag-based search and autocomplete
5. **Web/Mobile UI:** Users can search, autocomplete, and browse albums (Frontend TBD)
6. **SNS Sharing:** Selected photos + tags → Instagram, Facebook (Frontend TBD)

---

## 4. Technology Stack

| Layer | Technology |
| --- | --- |
| Frontend | TBD |
| Backend | Spring Boot, JPA, MySQL (Master/Slave) |
| Search Optimization | ElasticSearch, Redis |
| AI/LLM | TBD |
| Cloud Storage | TBD (local storage with DB URL possible) |
| SNS Integration | Instagram Graph API, Facebook API (Frontend TBD) |

---

## 5. CQRS Pattern Implementation

- **Command (Write-only)**  
    - Photo upload, AI tag storage, update/delete  
    - Uses Master MySQL DB
- **Query (Read-only)**  
    - Read operations routed to Slave MySQL DB  
    - Provides photo search, autocomplete, tag filtering  
    - Uses ElasticSearch + Redis for search optimization
- **Benefits:**  
    - Prevents read traffic overload on Master DB  
    - Ensures Master DB stability  
    - Optimizes search performance

---

## 6. Large-scale Data Handling

- Backend storage TBD (images accessed via URL)  
- AI/LLM processing TBD, MySQL storage, ElasticSearch/Redis indexing  
- Minimizes server memory usage, enables large-scale photo handling

---

## 7. Expected Benefits

- Fast autocomplete search using AI-generated photo tags (backend TBD)  
- Improved usability via SNS sharing (Frontend TBD)  
- Learning experience for handling large-scale photo data  
- Experience with CQRS pattern and search engines

---

## 8. Future Extensions

- **Personalized Recommendations:** Suggest similar photos based on AI analysis (backend TBD)  
- **Spring Batch Photo Recommendations:** Provide batch-processed suggestions for specific photo collections and upload sequences to users  
- **Multi-device Sync:** Sync photos across mobile, cloud, and web (Frontend TBD)  
- **Distributed/Cluster Architecture:** High-speed search and large-scale handling using ElasticSearch clusters
