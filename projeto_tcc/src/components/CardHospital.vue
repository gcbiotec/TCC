<template>
  <div class="image">
    <img alt="imagem do hospital" src="../assets/hospital.png" />
    <h2>{{ titulo }}</h2>
    <h4>{{ subtitulo }}</h4>
  </div>  
</template>

<script>
  export default {
    name: "CardHospital",
    props:{
        titulo: String,
        subtitulo: String,
    },
  };
</script>

<style>

</style>