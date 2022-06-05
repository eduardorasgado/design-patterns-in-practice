package structural.Composite.TreeAndLeavesExample.ImageEditorExample;

public class ImageEditor {
	
	private CompoundGraphic baseCanvas;
	
	public ImageEditor(CompoundGraphic canvas) {
		this.baseCanvas = canvas;
	}
	
	public void run() {
		Graphic dot1 = new Dot(10, 5);
		baseCanvas.addChild(dot1);
		
		CompoundGraphic canvas2 = new CompoundGraphic();
		Graphic dot2 = new Dot(1, 3);
		canvas2.addChild(dot2);
		Graphic dot3 = new Dot(8, 3);
		canvas2.addChild(dot3);
		Graphic dot4 = new Dot(14, 2);
		canvas2.addChild(dot4);
		
		CompoundGraphic canvas3 = new CompoundGraphic();
		Graphic dot5 = new Dot(1, 10);
		canvas3.addChild(dot5);
		
		canvas2.addChild(canvas3);
		
		baseCanvas.addChild(canvas2);
		
		baseCanvas.draw();
		System.out.println("------------DRAGGING-----------");
		baseCanvas.drag(2, 5);
		baseCanvas.draw();
	}
}
