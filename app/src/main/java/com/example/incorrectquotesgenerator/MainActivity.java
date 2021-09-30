package com.example.incorrectquotesgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;
    private EditText mEditText;
    private EditText mEditText2;
    private EditText mEditText3;

    TextView instructions;
    EditText charEntry;
    EditText charEntry2;
    EditText charEntry3;

    Button setCharButton;
    Button genQuoteButton;
    Button resetButton;
    TextView quoteView;
    ArrayList<String> SingleQuotes;
    ArrayList<String> DoubleQuotes;
    ArrayList<String> TripleQuotes;

    int numChar;
    int singleQuoteSelector;
    int doubleQuoteSelector;
    int tripleQuoteSelector;

    Random randomSingleQuote;
    Random randomDoubleQuote;
    Random randomTripleQuote;

    String char1;
    String char2;
    String char3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numChar = 0;

        instructions = (TextView) findViewById(R.id.instructions);
        charEntry = (EditText) findViewById(R.id.charEntry);
        charEntry2 = (EditText) findViewById(R.id.charEntry2);
        charEntry3 = (EditText) findViewById(R.id.charEntry3);
        quoteView = (TextView) findViewById(R.id.quoteView);
        setCharButton = (Button) findViewById(R.id.setCharButton);
        genQuoteButton = (Button) findViewById(R.id.genQuoteButton);
        resetButton = (Button) findViewById(R.id.resetButton);
        setCharButton.setVisibility(View.INVISIBLE);
        genQuoteButton.setVisibility(View.INVISIBLE);
        resetButton.setVisibility(View.VISIBLE);

        SingleQuotes = new ArrayList<>();
        DoubleQuotes = new ArrayList<>();
        TripleQuotes = new ArrayList<>();

        charEntry.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(charEntry!=null){
                    numChar = 1;
                    char1 = charEntry.getText().toString();
                    setCharButton.setVisibility(View.VISIBLE);
                }
                else{
                    numChar = 0;
                    setCharButton.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        charEntry2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(charEntry!= null && charEntry2!=null){
                    numChar = 2;
                    char1 = charEntry.getText().toString();
                    char2 = charEntry2.getText().toString();
                    setCharButton.setVisibility(View.VISIBLE);
                }
                else{
                    numChar = 0;
                    setCharButton.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        charEntry3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(charEntry!= null && charEntry2!=null && charEntry3!=null){
                    numChar = 3;
                    char1 = charEntry.getText().toString();
                    char2 = charEntry2.getText().toString();
                    char3 = charEntry3.getText().toString();
                    setCharButton.setVisibility(View.VISIBLE);
                }
                else{
                    numChar = 0;
                    setCharButton.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        setCharButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numChar == 1){
                    charEntry.setText(char1);
                    genQuoteButton.setVisibility(View.VISIBLE);
                    SingleQuotes.add(charEntry.getText().toString() + ": My ultimate goal is to punch God in the eye, just to spite him one last time.");
                    SingleQuotes.add(charEntry.getText().toString() + ": Sometimes, I don’t realize an event was traumatic until I tell it as a funny story and notice everyone is staring at me weird.");
                    SingleQuotes.add(charEntry.getText().toString() + ": I have yet to encounter a problem where a sword didn't factor into the solution at least in some way.");
                    SingleQuotes.add(charEntry.getText().toString() + ": Maybe the true treasure was friendship all along. But I hope not, because I can’t spend friendship on new clothes");
                    SingleQuotes.add(charEntry.getText().toString() + ": All the sudden I got a random burst of energy, and I think it's my body's last hurrah before it completely shuts down.");
                    SingleQuotes.add(charEntry.getText().toString() + ": *cocks gun* Go to Bed. This is no longer a request, This is now a Threat.");
                    SingleQuotes.add(charEntry.getText().toString() + ": The risk I took was calculated but, man, am I bad at math.");
                    SingleQuotes.add(charEntry.getText().toString() + ": I'm so tired of this life. I want to be a roomba. I want knives taped to me. And I want to be set loose.");
                }
                else if(numChar == 2){
                    charEntry.setText(char1);
                    charEntry2.setText(char2);
                    genQuoteButton.setVisibility(View.VISIBLE);
                    DoubleQuotes.add(charEntry.getText().toString() + ": Pardon the intrusion, but-" + "\n" + charEntry2.getText().toString() + ": On this moment or just my life in general?");
                    DoubleQuotes.add(charEntry.getText().toString() + ": " + charEntry2.getText().toString() + ", you’re such a genius!" + "\n" + charEntry2.getText().toString() + ": Yes, I know.");
                    DoubleQuotes.add(charEntry.getText().toString() + ": You remind me of the ocean." + "\n" + charEntry2.getText().toString() + ": Because I'm deep and mysterious?" + "\n" + charEntry.getText().toString() + ": No, because you're full of salt and you scare people.");
                    DoubleQuotes.add(charEntry.getText().toString() + ": My head hurts." + "\n" + charEntry2.getText().toString() + ": That’s your brain trying to comprehend its own stupidity.");
                    DoubleQuotes.add(charEntry.getText().toString() + ": I should've left you on that street corner where you were standing." + "\n" + charEntry2.getText().toString() + ": But ya' didn't!");
                    DoubleQuotes.add(charEntry.getText().toString() + ": What’s up? I’m back." + "\n" + charEntry2.getText().toString() + ": I literally saw you die. You died. You were dead." + "\n" + charEntry.getText().toString() + ": Death is a social construct.");
                    DoubleQuotes.add(charEntry.getText().toString() + ": What do you have?" + "\n" + charEntry2.getText().toString() + ": A KNIFE!" + "\n" + charEntry.getText().toString() + ": NO!");
                    DoubleQuotes.add(charEntry.getText().toString() + ": I’ve only had " + charEntry2.getText().toString() + " for a day and a half but if anything happened to them I would kill everyone in this room and then myself.");
                }
                else if(numChar == 3){
                    charEntry.setText(char1);
                    charEntry2.setText(char2);
                    charEntry3.setText(char3);
                    genQuoteButton.setVisibility(View.VISIBLE);
                    TripleQuotes.add(charEntry.getText().toString() + ": Well, remember when " + charEntry2.getText().toString() + " made a romantic dinner for me?" + "\n" + charEntry3.getText().toString() + ": " + charEntry.getText().toString() + ", they microwaved you a pizza.");
                    TripleQuotes.add(charEntry.getText().toString() + " & " + charEntry2.getText().toString() + ": *accidentally set the kitchen on fire*" + "\n" + charEntry.getText().toString() + ": We need an adult!" + "\n" + charEntry2.getText().toString() + ": " + charEntry.getText().toString() + ", you ARE an adult!" + "\n" + charEntry.getText().toString() + ": We need an adultier adult! Get " + charEntry3.getText().toString() + "!");
                    TripleQuotes.add(charEntry.getText().toString() + ": " + charEntry2.getText().toString() + ", I am questioning your sanity..." + "\n" + charEntry3.getText().toString() + ": I never questioned it, I knew their sanity was missing from the start.");
                    TripleQuotes.add(charEntry.getText().toString() + ": There are three ways to handle a difficult situation. The right way, the wrong way, and the " + charEntry2.getText().toString() + " way." + "\n" + charEntry3.getText().toString() + ": Isn't that the wrong way?" + "\n" + charEntry.getText().toString() + ": Yes, but it's faster.");
                    TripleQuotes.add(charEntry.getText().toString() + ": I’m afraid of clowns. There, I said it." + "\n" + charEntry2.getText().toString() + ": " + charEntry.getText().toString() + ", if you don't like clowns, why are you hanging with " + charEntry3.getText().toString() + "?");
                    TripleQuotes.add(charEntry.getText().toString() + ": Why would you give a knife to " + charEntry2.getText().toString() + "?!" + "\n" + charEntry3.getText().toString() + ", shrugging: " + charEntry2.getText().toString() + " felt unsafe." + "\n" + charEntry.getText().toString() + ": Now I feel unsafe!" + "\n" + charEntry3.getText().toString() + ": I’m sorry…" + "\n" + charEntry3.getText().toString() + ": Would you like a knife?");
                    TripleQuotes.add(charEntry.getText().toString() + ": Without ugly, there would be no beauty in this world." + "\n" + charEntry2.getText().toString() + ": Thank you for your sacrifice, " + charEntry3.getText().toString() + ".");
                    TripleQuotes.add(charEntry.getText().toString() + ": Hello all, it is I, your favorite person." + "\n" + charEntry2.getText().toString() + ": Actually, " + charEntry3.getText().toString() + " is my favourite." + "\n" + charEntry.getText().toString() + ": Okay then, it is I, that bitch.");
                }
            }
        });

        mContext = getApplicationContext();
        mActivity = MainActivity.this;
        mEditText = (EditText) findViewById(R.id.charEntry);

        mEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager)
                        view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        });

        mEditText2 = (EditText) findViewById(R.id.charEntry2);

        mEditText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager)
                        view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        });

        mEditText3 = (EditText) findViewById(R.id.charEntry3);

        mEditText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager)
                        view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        });

        genQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numChar == 1){
                    randomSingleQuote = new Random();
                    singleQuoteSelector = randomSingleQuote.nextInt(8);
                    quoteView.setText(SingleQuotes.get(singleQuoteSelector));
                }
                else if(numChar == 2){
                    randomDoubleQuote = new Random();
                    doubleQuoteSelector = randomDoubleQuote.nextInt(8);
                    quoteView.setText(DoubleQuotes.get(doubleQuoteSelector));
                }
                else if(numChar == 3){
                    randomTripleQuote = new Random();
                    tripleQuoteSelector = randomTripleQuote.nextInt(8);
                    quoteView.setText(TripleQuotes.get(tripleQuoteSelector));
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char1 = null;
                char2 = null;
                char3 = null;
                charEntry.setText(null);
                charEntry2.setText(null);
                charEntry3.setText(null);
                quoteView.setText(null);
                SingleQuotes.clear();
                DoubleQuotes.clear();
                TripleQuotes.clear();
                numChar = 0;
                setCharButton.setVisibility(View.INVISIBLE);
                genQuoteButton.setVisibility(View.INVISIBLE);
            }
        });

    }
}