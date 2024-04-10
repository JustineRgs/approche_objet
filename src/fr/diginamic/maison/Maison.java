package fr.diginamic.maison;

public class Maison {
	private Piece[] pieces;

	public Maison(int capaciteMax) {
		this.pieces = new Piece[capaciteMax];
	}

	public void ajouterPiece(Piece piece) {
		boolean capaciteOk = false;
		if (piece != null && piece.getSuperficie() > 0 && piece.getEtage() >= 0) {
			for (int i = 0; i < pieces.length; i++) {
				if (pieces[i] == null) {
					pieces[i] = piece;
					capaciteOk = true;
					break;
				}
			}
			if (!capaciteOk) {
				System.out.println("Capacité maximale atteinte");
			}
		}
		else {
			 System.out.println("Impossible d'ajouter cette piece (Mauvais paramètre)");
		}
	}

	public double superficieTotale() {
		double superficieTotale = 0;
		for (Piece piece : pieces) {
			if (piece != null) {
				superficieTotale += piece.getSuperficie();
			}
		}
		return superficieTotale;
	}

	public double superficieEtage(int etage) {
		double superficieEtage = 0;
		for (Piece piece : pieces) {
			if (piece != null && piece.getEtage() == etage) {
				superficieEtage += piece.getSuperficie();
			}
		}
		return superficieEtage;
	}
	
	public double superficieParPiece(String typePiece) {
	    double superficiePiece = 0;
	    for (Piece piece : pieces) {
	        if (piece != null && piece.getClass().getSimpleName().equals(typePiece)) {
	        	superficiePiece += piece.getSuperficie();
	        }
	    }
	    return superficiePiece;
	}

	public double nombresPieces(String typePiece) {
	    double nombrePieces = 0;
	    for (Piece piece : pieces) {
	        if (piece != null && piece.getClass().getSimpleName().equals(typePiece)) {
	        	nombrePieces++;
	        }
	    }
	    return nombrePieces;
	}
}
