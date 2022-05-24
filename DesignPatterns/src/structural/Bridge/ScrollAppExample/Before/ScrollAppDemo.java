package structural.Bridge.ScrollAppExample.Before;

import java.util.ArrayList;
import java.util.List;

public class ScrollAppDemo {
	
	public static void main(String[] args) {
		List<ViewModel> items = new ArrayList<>();
		
		items.add(new WithThumbnailVideoViewModel("Falling without parachute", (60*5) + 18, "https://youtube.com/235729857392"));
		items.add(new JustTextStreamViewModel("ACZINO vs MKS", 12444, true));
		items.add(new JustTextVideoViewModel("Guided Meditation for your morning", 60*15, "Meditate with lama Rinchen Yatzen", true));
		
		// this thing smells reaaaally bad
		for(ViewModel item : items) {
			if(item instanceof WithThumbnailVideoViewModel) {
				((WithThumbnailVideoViewModel) item).render();
			} else if(item instanceof WithThumbnailStreamViewModel) {
				((WithThumbnailStreamViewModel) item).render();
			} else if(item instanceof JustTextVideoViewModel) {
				((JustTextVideoViewModel) item).render();
			} else if(item instanceof JustTextStreamViewModel) {
				((JustTextStreamViewModel) item).render();
			}
		}
	}
}
