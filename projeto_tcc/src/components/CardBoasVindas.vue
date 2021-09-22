<template>
  <div class="image">
    <img alt="Vue Pet" src="../assets/medic1.png" />
    <h2>{{ titulo }}</h2>
    <h4>{{ subtitulo }}</h4>
  </div>
</template>

<script>
export default {
  name: "CardBoasVindas",
  props: {
    titulo: String,
    subtitulo: String,
  },
};
</script>

<style scoped>
</style>