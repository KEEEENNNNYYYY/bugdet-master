# bugdet-master


# Exercice : BudgetMaster - Suivi des finances personnelles

# I. Scénario
Vous êtes chargé de développer une application appelée BudgetMaster qui aide les
utilisateurs à suivre leurs dépenses et à gérer leur budget. L'application permettra aux
utilisateurs d'ajouter des dépenses, de les catégoriser, de définir un budget mensuel et
d'analyser leurs habitudes de dépense.

# II. Exigences :
## 1. Profil de l'utilisateur
    Chaque profil d'utilisateur doit comporter :
    ○ Nom de l'utilisateur
    ○ Budget mensuel (le montant que l'utilisateur prévoit de dépenser chaque
    mois)
    ○ Liste des dépenses (chaque dépense comprend une description, un montant,
    une catégorie, et une date)
## 2. Catégories de dépenses
    Les dépenses doivent être catégorisées. Les catégories possibles incluent :
    ○ Nourriture et restauration
    ○ Transport
    ○ Divertissement
    ○ Services publics
    ○ Autres
## 3. Suivi des dépenses
    L'application doit permettre aux utilisateurs de :
    ○ Ajouter une nouvelle dépense : Cela inclut l'entrée d'une description, du
    montant, de la catégorie, et de la date.
    ○ Afficher toutes les dépenses : Affichez une liste de toutes les dépenses, triées
    par date.
    ○ Afficher les dépenses par catégorie : Filtrer et afficher les dépenses en
    fonction de leur catégorie.
## 4. Analyse du budget
    L'application doit fournir des informations sur les dépenses de l'utilisateur :
    ○ Total dépensé ce mois-ci : Calculer le montant total dépensé par l'utilisateur
    au cours du mois en cours.
    ○ Budget restant : Calculer combien il reste du budget mensuel après avoir pris
    en compte toutes les dépenses.
    ○ Alerte de dépassement de budget : Si les dépenses totales dépassent le
    budget mensuel, l'application doit en informer l'utilisateur.
## 5. Résumé des dépenses
    L'application doit être capable de générer un résumé des dépenses de l'utilisateur :
    ○ getTopCategories : Retourne les 3 catégories dans lesquelles l'utilisateur a
    dépensé le plus d'argent.
    ○ calculateAverageSpendingPerCategory : Calculer et retourner la dépense
    moyenne par catégorie.

# III. Méthodes à implémenter:
## 1. addExpense
    ○ Paramètres : Une dépense, c'est -à -dire, une description, un montant, une
    catégorie, et une date.
    ○ Action : Ajoutez cette dépense au profil de l'utilisateur.
    ○ Conseil : Assurez-vous de gérer les cas particuliers, comme les montants
    négatifs.
## 2. getExpenseByCategory
    ○ Paramètres : Une catégorie auquel on s’intéresse ;
    ○ Action : Afficher uniquement toutes les dépenses ayant la catégorie fournie ;
    ○ Conseil : Revoyez comment on utilise filter ;
## 3. getTotalSpentThisMonth
    ○ Paramètres : Aucun (utiliser le mois en cours).
    ○ Retourne : Le montant total dépensé par l'utilisateur au cours du mois en
    cours.
    ○ Conseil : Utilisez la date actuelle pour filtrer les dépenses.
## 4. getRemainingBudget
    ○ Paramètres : Aucun (utiliser le budget du mois en cours).
    ○ Retourne : Le budget restant pour le mois en cours.
    ○ Conseil : Soustrayez les dépenses totales du budget mensuel.
## 5. getTopCategories
    ○ Paramètres : Aucun.
    ○ Retourne : Les 3 catégories dans lesquelles l'utilisateur dépense le plus
    d'argent.
    ○ Conseil : Agrégez les dépenses par catégorie et triez-les.
## 6. calculateAverageSpendingPerCategory
    ○ Paramètres : Aucun.
    ○ Retourne : Chaque catégorie et sa dépense moyenne correspondante.
    ○ Conseil : Divisez la somme des dépenses par catégorie par le nombre de
    dépenses dans cette catégorie.

