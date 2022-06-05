package structural.Composite.ImageEditorExample;

public class ImageEditorDemo {
	public static void main(String[] args) {
		CompoundGraphic baseCanvas = new CompoundGraphic();
		ImageEditor editor = new ImageEditor(baseCanvas);
		editor.run();
	}
}
