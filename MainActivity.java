package pdfviewer.pdfviewer;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView grid1;
    int categoryPostition;


//    Context contextNew;
    Context context1;
//    Resources res1=context1.getResources();

//    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
        //Toast.makeText(getApplicationContext(),"test"+(categoryPostition),Toast.LENGTH_LONG).show();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
//        String category = extras.getString("category");
        SharedPreferences sharedPreferences = getSharedPreferences("category", Context.MODE_PRIVATE);
        String admin = sharedPreferences.getString("name","");
        categoryPostition = Integer.parseInt(admin);
//        Toast.makeText(getApplicationContext(),"test"+(categoryPostition),Toast.LENGTH_LONG).show();
        //
      //  if (categoryPostition == 0) {
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new VivzAdapter(this));
            grid1.setOnItemClickListener(this);
        //}
  /*      else if (categoryPostition == 1) {
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new Vivz1Adapter(this));
            grid1.setOnItemClickListener(this);
        }
        else if (categoryPostition == 2) {
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new Vivz2Adapter(this));
            grid1.setOnItemClickListener(this);
        }
        else if (categoryPostition == 3) {
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new Vivz3Adapter(this));
            grid1.setOnItemClickListener(this);
        }
        else if (categoryPostition == 4) {
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new Vivz4Adapter(this));
            grid1.setOnItemClickListener(this);
        }
        else if (categoryPostition == 5) {
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new Vivz5Adapter(this));
            grid1.setOnItemClickListener(this);
        }
        else{
            grid1 = (GridView) findViewById(R.id.book_grid);
            grid1.setAdapter(new Vivz6Adapter(this));
            grid1.setOnItemClickListener(this);
        }*/



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this,pdf_viewer.class);
//        i.putExtra()
//        String[] bookName = res1.getStringArray(R.array.book_name);
        i.putExtra("bookName",String.valueOf(position));
        i.getStringExtra(String.valueOf(position).toString());
        startActivity(i);
        Toast.makeText(getApplicationContext(),"book Opened"+(position+1),Toast.LENGTH_LONG).show();
    }
}
class Book
{
    int imageId;
    String bookName;
    Book(int imageId,String bookName)
    {
        this.imageId=imageId;
        this.bookName=bookName;
    }

}
class VivzAdapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    MainActivity obj = new MainActivity();

    int val = obj.categoryPostition;
    //SharedPreferences settings = getSharedPreferences("category",0);
   //   int categoryPostition = settings.getInt("name",0);
    VivzAdapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();
        //SharedPreferences settings = getSharedPreferences("category",0);
        //categoryPostition = settings.getInt("name",0);
//       MainActivity mn = new MainActivity();
        if (val == 0)
        {
            String[] book_array = res.getStringArray(R.array.science_books);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }
        if (val == 1)
        {
            String[] book_array = res.getStringArray(R.array.science_books);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }
        if (val == 2)
        {
            String[] book_array = res.getStringArray(R.array.book_name);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }
        if (val == 3)
        {
            String[] book_array = res.getStringArray(R.array.science_books);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }
        if (val == 4)
        {
            String[] book_array = res.getStringArray(R.array.book_name);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }
        if (val == 5)
        {
            String[] book_array = res.getStringArray(R.array.science_books);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }
        if (val == 6)
        {
            String[] book_array = res.getStringArray(R.array.book_name);
            int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
            for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
            {
                Book tempbook = new Book(book_img[i],book_array[i]);
                list.add(tempbook);
            }

        }


    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}
//1
class Vivz1Adapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    //    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
    Vivz1Adapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();

//       MainActivity mn = new MainActivity();

        String[] book_array = res.getStringArray(R.array.book_name);
        int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
//        for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
//        {
//            Book tempbook = new Book(book_img[i],book_array[i]);
//            list.add(tempbook);
//        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}

//2
class Vivz2Adapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    //    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
    Vivz2Adapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();

//       MainActivity mn = new MainActivity();

        String[] book_array = res.getStringArray(R.array.book_name);
        int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
//        for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
//        {
//            Book tempbook = new Book(book_img[i],book_array[i]);
//            list.add(tempbook);
//        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}

//3
class Vivz3Adapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    //    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
    Vivz3Adapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();

//       MainActivity mn = new MainActivity();

        String[] book_array = res.getStringArray(R.array.book_name);
        int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
//        for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
//        {
//            Book tempbook = new Book(book_img[i],book_array[i]);
//            list.add(tempbook);
//        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}
//4
class Vivz4Adapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    //    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
    Vivz4Adapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();

//       MainActivity mn = new MainActivity();

        String[] book_array = res.getStringArray(R.array.book_name);
        int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
        for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
        {
            Book tempbook = new Book(book_img[i],book_array[i]);
            list.add(tempbook);
        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}

//5 science
class Vivz5Adapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    //    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
    Vivz5Adapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();

//       MainActivity mn = new MainActivity();

        String[] book_array = res.getStringArray(R.array.science_books);
        int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
        for (int i =0;i<res.getStringArray(R.array.science_books).length;i++)
        {
            Book tempbook = new Book(book_img[i],book_array[i]);
            list.add(tempbook);
        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}
//6tech

class Vivz6Adapter extends BaseAdapter
{
    ArrayList<Book> list;
    Context context;
    //    SharedPreferences settings = getSharedPreferences("category",0);
//    int categoryPostition = settings.getInt("name",0);
    Vivz6Adapter(Context context)
    {
        this.context=context;
        list=new ArrayList<Book>();
        Resources res=context.getResources();

//       MainActivity mn = new MainActivity();

        String[] book_array = res.getStringArray(R.array.book_name);
        int[] book_img = {R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.cover,R.drawable.image,R.drawable.image};
//        for (int i =0;i<res.getStringArray(R.array.book_name).length;i++)
//        {
//            Book tempbook = new Book(book_img[i],book_array[i]);
//            list.add(tempbook);
//        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_book,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Book temp=list.get(position);
        holder.myBook.setImageResource(temp.imageId);
        holder.myBook_name.setText(temp.bookName);
        return row;
    }
    class ViewHolder
    {
        ImageView myBook;
        TextView myBook_name;
        ViewHolder(View v)
        {
            myBook=(ImageView) v.findViewById(R.id.img_view);
            myBook_name= (TextView) v.findViewById(R.id.textView);
        }
    }
}
