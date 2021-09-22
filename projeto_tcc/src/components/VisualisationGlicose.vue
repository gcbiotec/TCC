<template>
          <Chart :chart-data="datacollection"></Chart>
</template>
<script>
import Chart from "../Chart.js";
export default {
  components: {
    Chart
  },
  data() {
    return {
      datacollection: null
    };
  },
  mounted() {
    this.fillData();
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
            label: "Glicose",
            backgroundColor: "#f87d79",
            data: [this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt(),this.getRandomInt(), this.getRandomInt()]
          },
        ]
      };
    },
    getRandomInt() {
      return Math.floor(Math.random() * (50 - 5 + 1)) + 5;
    }
  }
};
</script>

<style>
</style>

