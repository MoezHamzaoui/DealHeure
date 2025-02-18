package com.dh.model;

public class RenduMonnaie {

    public static class Monnaie {
        private int piece2;
        private int billet5;
        private int billet10;

        public Monnaie(int piece2, int billet5, int billet10) {
            this.piece2 = piece2;
            this.billet5 = billet5;
            this.billet10 = billet10;
        }

        public int getPiece2() {
            return piece2;
        }

        public int getBillet5() {
            return billet5;
        }

        public int getBillet10() {
            return billet10;
        }

        @Override
        public String toString() {
            return "Monnaie [piece2=" + piece2 + ", billet5=" + billet5 + ", billet10=" + billet10 + "]";
        }
    }

    public static Monnaie monnaieOptimale(long s) {
        // Vérification si le montant est un nombre valide (le montant doit être positif)
        if (s <= 0) {
            return null; // Impossible de rendre la monnaie pour des montants négatifs ou nuls
        }

        // Variables pour suivre la meilleure solution
        int minPiece2 = Integer.MAX_VALUE;
        int minBillet5 = Integer.MAX_VALUE;
        int minBillet10 = Integer.MAX_VALUE;

        // On explore toutes les combinaisons possibles
        for (int billet10 = 0; billet10 <= s / 10; billet10++) {
            for (int billet5 = 0; billet5 <= (s - billet10 * 10) / 5; billet5++) {
                int remaining = (int) (s - billet10 * 10 - billet5 * 5);

                // On vérifie si le reste peut être composé uniquement de pièces de 2€
                if (remaining % 2 == 0) {
                    int piece2 = remaining / 2;
                    if (piece2 >= 0) {
                        // Mettre à jour le résultat si cette combinaison est plus optimale
                        if (billet10 + billet5 + piece2 < minBillet10 + minBillet5 + minPiece2) {
                            minPiece2 = piece2;
                            minBillet5 = billet5;
                            minBillet10 = billet10;
                        }
                    }
                }
            }
        }

        // Si une solution a été trouvée, retourner l'objet Monnaie
        if (minPiece2 != Integer.MAX_VALUE) {
            return new Monnaie(minPiece2, minBillet5, minBillet10);
        } else {
            return null; // Si aucune solution n'a été trouvée
        }
    }

    public static void main(String[] args) {
        // Test avec différents montants
        long[] tests = {1, 6, 10, 11, 15, 30, 22, 37, 31};
        for (long montant : tests) {
            Monnaie monnaie = monnaieOptimale(montant);
            if (monnaie == null) {
                System.out.println("Impossible de rendre la monnaie pour: " + montant);
            } else {
                System.out.println("Pour " + montant + "€, on rend: " + monnaie);
            }
        }
    }
}
