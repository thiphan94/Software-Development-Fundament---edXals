package week2;


public class Squarelotron {
    public int[][] squarelotron;
    public int size;
    
    public Squarelotron(int n){
        this.size = n;
        int valeur = 1 ;
        squarelotron = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                this.squarelotron[i][j] = valeur;
                valeur ++;
            }
        }
    }
    
    public int maxring() {
	int max = 0 ;
	if (this.size % 2 == 0) {
	    max = size / 2;
	}
	else {
	    max = (size / 2) + 1; 
	}
	return  max;
    }
    
  
    public Squarelotron upsideDownFlip(int ring) throws NumberFormatException {
        if( ring > this.maxring() || ring < 1) {
            throw new NumberFormatException();
        }
        Squarelotron newmatrix = new Squarelotron(this.size);
        int min = ring -1; 
        int max = size - ring;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i == min || i == max) {
                    if (j >= min && j <= max) {
                        newmatrix.squarelotron[i][j] = this.squarelotron[size -1 -i][j];
                    }
                }
                else if (i > min && i < max) { 
                    if (j == min || j == max) {
                        newmatrix.squarelotron[i][j] = this.squarelotron[size -1 -i][j];
                    }
                }
            }
        }
        return newmatrix;
	
    }
    
    
    public Squarelotron mainDiagonalFlip(int ring) throws NumberFormatException {
	if (ring > this.maxring() || ring < 1) {
	    throw new NumberFormatException();
	}
	Squarelotron newmatrix = new Squarelotron(this.size);
        int min = ring -1; 
        int max = size - ring;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i == min || i == max) {
                    if (j >= min && j <= max) {
                        newmatrix.squarelotron[i][j] = this.squarelotron[j][i];
                    }
                }
                else if (i > min && i < max) {
                    if (j == min || j == max) {
                        newmatrix.squarelotron[i][j] = this.squarelotron[j][i];
                    }
                }
            }
        }
        return newmatrix;
    }
    
    public void rotateRight(int numberOfTurns) {
	numberOfTurns = (numberOfTurns % 4 + 4) % 4;
        for (int n = 0; n <numberOfTurns; n++) {
            Squarelotron newmatrix = new Squarelotron(this.size);
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    newmatrix.squarelotron[j][this.size - 1 - i] = this.squarelotron[i][j];
                }
            }
            this.squarelotron = newmatrix.squarelotron;
        }
    }
    

}