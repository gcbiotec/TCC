<template>
          <Chart :chart-data="datacollection"></Chart>
</template>
<script>
import Chart from "../Chart.js";
export default {
   props: {
    titulo: String,
    subtitulo: String,
  },
  components: {
    Chart
  },
  data() {
    return {
      datacollection: null,
      listaProntuarios: {},

    };
  },
 
  mounted() {
    fetch(`http://localhost:8080/pacientes/{$idpaciente}/prontuarios`, {
      method: "GET",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
    })
      .then((response) => {
        if (response.ok) return response.json();
      })
      .then((prontuarioJSON) => {
        this.listaProntuarios = prontuarioJSON;
      });
  },
  methods: {
    fillData() {
      this.datacollection = {
        labels: [
          "Dia 1",
          "Dia 2",
          "Dia 3",
          "Dia 4",
          "Dia 5",
          "Dia 6",
          "Dia 7",
          
        ],
        datasets: [
         
          {
            label: "Creatinina",
            backgroundColor: "##A5CC82",
            data: [this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt()]
          }
        ]
      };
    },
    getRandomInt() {
      return Math.floor(Math.random() * (50 - 5 + 1)) + 5;
    },
    // getCreatinina(){
    //   for (prontuario in listaProntuarios) 
    //   return prontuario.creatinina}
    // }
  }
};
</script>

<style>
</style>

