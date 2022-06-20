package structural.Flyweight.ForestExample;

public class Canvas implements ICanvas {
	private String[][] grid;
	private int height, width;
	private String EMPTY_SPACE = " ";
	
	public Canvas(int height, int width) {
		grid = new String[height][width];
		this.height = height;
		this.width = width;
		
		fillGrid();
	}

	private void fillGrid() {
		for(int i = 0; i < height; i++) {
			grid[i] = new String[width];
			
			for(int j = 0; j < width; j++) {
				grid[i][j] = EMPTY_SPACE;
			}
		}
	}

	@Override
	public void addGraphicElement(int x, int y, String texture) {
		if( x < height && y < width) {
			grid[x][y] = texture;
		} else {
			System.out.println("Error: el punto a agregar excede los límites del canvas");
		}
	}

	@Override
	public void render() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(grid[i][j] + EMPTY_SPACE);
			}
			System.out.println();
		}
	}
}
