<template>
  <div>
     

    <div class="row">
      <div class="col-6">
        <div id="glicose">
          <card-grafico-glicose />
        </div>
      </div>
      <div class="col-6">
        <div id="creatinina">
          <card-grafico-creatinina />
        </div>
      </div>

      <div class="row"></div>
      <div class="row"></div>
      <div class="row"></div>
      <div class="row"></div>
    </div>
    <div class="row">
      <div class="col-6">
        <div id="hemoglobina">
          <card-grafico-hemoglobina />
        </div>
      </div>
      <div class="col-6">
        <div id="troponina">
          <card-grafico-troponina />
        </div>

        <!-- <visualisation></visualisation> -->
      </div>
    </div>
  </div>
</template>

<script>
// import Visualisation from "@/components/Visualisation.vue";

//import CardGrafico from '../components/CardGrafico.vue';
import CardGraficoCreatinina from "../components/CardGraficoCreatinina.vue";
import CardGraficoGlicose from "../components/CardGraficoGlicose.vue";
import CardGraficoTroponina from "../components/CardGraficoTroponina.vue";
import CardGraficoHemoglobina from "../components/CardGraficoHemoglobina.vue";

export default {
  name: "Grafico",
  data() {
    return {
      listaPacientes: {},
    };
  },
  components: {
    // Visualisation,

    //CardGrafico,
    CardGraficoGlicose,
    CardGraficoCreatinina,
    CardGraficoTroponina,
    CardGraficoHemoglobina,
  },
  mounted() {
    fetch(`http://localhost:8080/pacientes`, {
      method: "GET",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
    })
      .then((response) => {
        if (response.ok) return response.json();
      })
      .then((pacientesJSON) => {
        this.listaPacientes = pacientesJSON;
      });
  },
};
</script>

<style>
#glicose {
  display: flex;
  flex-direction: column;
  height: 700px;
  width: 500px;
  padding-top: 70pt;
}
#troponina {
  display: flex;
  flex-direction: column;
  align-self: auto;
  padding-top: 70pt;
  height: 700px;
  width: 500px;
}
#hemoglobina {
  display: flex;
  flex-direction: column;
  align-self: auto;
  height: 100px;
  width: 500px;
  padding-top: 70pt;
}
#creatinina {
  display: flex;
  flex-direction: column;
  align-self: auto;
  height: 100px;
  width: 500px;
  padding-top: 70pt;
}
</style>