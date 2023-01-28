package com.eimar_ramos.testexamen_ev2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eimar_ramos.testexamen_ev2.R;
import com.eimar_ramos.testexamen_ev2.adapters.RecyclerDataAdapter;
import com.eimar_ramos.testexamen_ev2.models.Hobby;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerDataAdapter adapter;
    private List<Hobby> listData;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        listData = getDummyData();


        adapter = new RecyclerDataAdapter(listData, new RecyclerDataAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Hobby hobby) {
                // Acción a realizar al hacer click en un elemento del RecyclerView
            }
        });
        recyclerView.setAdapter(adapter);

        return  view;
    }

    private List<Hobby> getDummyData() {
        List<Hobby> list = new ArrayList<Hobby>();
        list.add(new Hobby("The Hobbit","Book",8,"The Hobbit can be sort of a \"gateway\" book, as it provides Tolkien's amazing fantasy and storytelling but without the (sometimes intimidating) detail and complexity of LOTR. The Hobbit will introduce Tolkien's world and mythology, so you will have some context when you read LOTR."));
        list.add(new Hobby("The Matrix","Film",9,"An excellent movie with tons of special effects, fight scenes, etc., and the best thing is that they are all done perfectly. A really good film with an interesting story behind it."));
        list.add(new Hobby("Tetris","Game",8,"I love it. The gameplay is awesome and the control is ok."));
        list.add(new Hobby("The Beatles: The Beatles","Music",10,"One of the best Beatles albums and for sure one of the best albums of all time. The sound of the album is just beautiful and much much better than the beautiful original"));

        list.add(new Hobby("Leviathan Wakes","Book",9,"This is the first novel in the series and, having just finished it, can confirm that it can be read standalone with no further commitment to the series. I am planning on reading the next book very soon though; I enjoyed this first story very much"));
        list.add(new Hobby("Endgame","Film",8,"It is a perfect film. For a long time i didn't had so big range off emotions from a single film."));
        list.add(new Hobby("Super Mario: Odyssey","Game",10,"Of Mario games it's definitely one of my favorites! It provides a unique universe with pure fun, at various times in the game I felt immersed in the world of Mario, the game is so much fun!"));
        list.add(new Hobby("The Rolling Stones: Beggars Banquet","Music",9,"Rejoice in the music of Beggars Banquet that sounds as vital today as when it was released five decades ago. But unless you’ve got money to burn, it’s best to stick with the existing versions of one of the Rolling Stones’ most immersive and enduring works."));
        return list;
    }
}