package recycler_keluarga.elfanrodhian.xyz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Elfan Rodhian on 10/9/2017.
 */

class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {
    private GestureDetector gesttureDetector;
    private ClickListener clickListener;


    public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ClickListener clickListener) {
        this.clickListener = clickListener;
        gesttureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e){ return true; }

            @Override
            public void onLongPress(MotionEvent e) {
                View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                if (child != null && clickListener != null) {
                    clickListener.onLongClick(child, recyclerView.getChildPosition(child));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e){
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        if (child != null && clickListener != null && gesttureDetector.onTouchEvent(e))
            clickListener.onClick(child, rv.getChildPosition(child));
            return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e){

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }

}
