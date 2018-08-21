package com.example.vetrandir.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.view.View;

public class Inventory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        getSupportActionBar().hide();
    }
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
    }
        /*public void OnClickShelezo(View view) {
            Intent intent = new Intent(Inventory.this, IShelezo.class);
            startActivity(intent);
        }
        public void OnClickMed(View view) {
            Intent intent = new Intent(Inventory.this, IMed.class);
            startActivity(intent);
        }
        public void OnClickKwarz(View view) {
            Intent intent = new Intent(Inventory.this, IKwarz.class);
            startActivity(intent);
        }
        public void OnClickGraok(View view) {
            Intent intent = new Intent(Inventory.this, IGraok.class);
            startActivity(intent);
        }
        public void OnClickGrafen(View view) {
            Intent intent = new Intent(Inventory.this, IGrafen.class);
            startActivity(intent);
        }*/
        public void OnClickSteklo(View view) {
            Intent intent = new Intent(Inventory.this, ISteklo.class);
            startActivity(intent);
        }
    /*public void OnClickVtoip(View view) {
        Intent intent = new Intent(Inventory.this, IVtoip.class);
        startActivity(intent);
    }*/

        public void OnClickMedProvoda(View view) {
            Intent intent = new Intent(Inventory.this, IMedProvoda.class);
            startActivity(intent);
        }
        /*public void OnClickZhelezPlast(View view) {
            Intent intent = new Intent(Inventory.this, IZhelezPlast.class);
            startActivity(intent);
        }*/
        /*public void OnClickResina(View view) {
            Intent intent = new Intent(Inventory.this, IResina.class);
            startActivity(intent);
        }*/
        /*public void OnClickLopast(View view) {
            Intent intent = new Intent(Inventory.this, ILopast.class);
            startActivity(intent);
        }*/
        /*public void OnClickAntenna(View view) {
            Intent intent = new Intent(Inventory.this, IAntenna.class);
            startActivity(intent);
        }*/
        /*public void OnClickTruba(View view) {
            Intent intent = new Intent(Inventory.this, ITruba.class);I
            startActivity(intent);
        }
        public void OnClickCorpus(View view) {
            Intent intent = new Intent(Inventory.this, ICorpus.class);
            startActivity(intent);
        }
        public void OnClickBaki(View view) {
            Intent intent = new Intent(Inventory.this, IBaki.class);
            startActivity(intent);
        }Inventory
        public void OnClickEkran(View view) {
            Intent intent = new Intent(Inventory.this, IEkran.class);
            startActivity(intent);
        }
        public void OnClickChip(View view) {
            Intent intent = new Intent(Inventory.this, IChip.class);
            startActivity(intent);
        }
        public void OnClickVtoipovayaPlast(View view) {
            Intent intent = new Intent(Inventory.this, IVtoipovayaPlast.class);
            startActivity(intent);
        }
        public void OnClickProvodka(View view) {
            Intent intent = new Intent(Inventory.this, IProvodka.class);
            startActivity(intent);
        }
        public void OnClickSoplo(View view) {
            Intent intent = new Intent(Inventory.this, ISoplo.class);
            startActivity(intent);
        }
        public void OnClickVint(View view) {
            Intent intent = new Intent(Inventory.this, IVint.class);
            startActivity(intent);
        }
        public void OnClickProcessor(View view) {
            Intent intent = new Intent(Inventory.this, IProcessor.class);
            startActivity(intent);
        }
        public void OnClickAccumulator(View view) {I
            Intent intent = new Intent(Inventory.this, IAccumulator.class);
            startActivity(intent);
        }
        public void OnClickTurbina(View view) {
            Intent intent = new Intent(Inventory.this, ITurbina.class);
            startActivity(intent);
        }
        public void OnClickNasos(View view) {
            Intent intent = new Intent(Inventory.this, INasos.class);
            startActivity(intent);
        }
        public void OnClickSolnechnayaPanel(View view) {
            Intent intent = new Intent(Inventory.this, ISolnechnayaPanel.class);
            startActivity(intent);
        }
        public void OnClickSputnikovayaTarelka(View view) {
            Intent intent = new Intent(Inventory.this, ISputnikovayaTarelka.class);
            startActivity(intent);
        }
        public void OnClickTransponder(View view) {
            Intent intent = new Intent(Inventory.this, ITransponder.class);
            startActivity(intent);
        }
        public void OnClickObtekatel(View view) {
            Intent intent = new Intent(Inventory.this, IObtekatel.class);
            startActivity(intent);
        }
        public void OnClickObshivka(View view) {
            Intent intent = new Intent(Inventory.this, IObshivka.class);
            startActivity(intent);
        }
        public void OnClickComputer(View view) {
            Intent intent = new Intent(Inventory.this, IComputer.class);
            startActivity(intent);
        }
        public void OnClickTelephon(View view) {
            Intent intent = new Intent(Inventory.this, ITelephon.class);
            startActivity(intent);
        }
        public void OnClickSputnik(View view) {
            Intent intent = new Intent(Inventory.this, ISputnik.class);
            startActivity(intent);
        }
        public void OnClickSistemaShizneobespecheniya(View view) {
            Intent intent = new Intent(Inventory.this, ISistemaShisneobespecheniya.class);
            startActivity(intent);
        }
        public void OnClickShiloyModul(View view) {
            Intent intent = new Intent(Inventory.this, IShiloyModul.class);I
            startActivity(intent);
        }
        public void OnClickRaketniyUskoritel(View view) {
            Intent intent = new Intent(Inventory.this, IRaketniyUskoritel.class);
            startActivity(intent);
        }
        public void OnClickBortovoyComputer(View view) {
            Intent intent = new Intent(Inventory.this, IBortovoyComputer.class);
            startActivity(intent);
        }
        public void OnClickElektrodvigatel(View view) {
            Intent intent = new Intent(Inventory.this, IElektrodvigatel.class);
            startActivity(intent);
        }
        public void OnClickMarsochod(View view) {
            Intent intent = new Intent(Inventory.this, IMarsochod.class);
            startActivity(intent);
        }
        public void OnClickServer(View view) {
            Intent intent = new Intent(Inventory.this, IServer.class);
            startActivity(intent);
        }
        public void OnClickLetaushayaMashina(View view) {
            Intent intent = new Intent(Inventory.this, ILetaushayaMashina.class);
            startActivity(intent);
        }
        public void OnClickTretyaStupen(View view) {
            Intent intent = new Intent(Inventory.this, ITretyaStupen.class);
            startActivity(intent);I
        }
        public void OnClickVtorayaStupen(View view) {
            Intent intent = new Intent(Inventory.this, IVtorayaStupen.class);
            startActivity(intent);
        }
        public void OnClickPervayaStupen(View view) {
            Intent intent = new Intent(Inventory.this, IPervayaStupen.class);
            startActivity(intent);
        }
        public void OnClickModulStancii(View view) {
            Intent intent = new Intent(Inventory.this, IModulStancii.class);
            startActivity(intent);
        }
        public void OnClickRaketa(View view) {
            Intent intent = new Intent(Inventory.this, IRaketa.class);
            startActivity(intent);
        }
        public void OnClickMeshplanetnayaStanciya(View view) {
            Intent intent = new Intent(Inventory.this, IMeshplanetnayaStanciya.class);
            startActivity(intent);
        }*/
    }

