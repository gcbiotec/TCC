<template>
  <div id="Grafico">

    <h3>{{titulo}}</h3>
    <h5>{{subtitulo}}</h5>
     
  </div>  
</template>

<script>
export default {
    name: 'CardGrafico',
    props: {
    titulo: String,
    subtitulo: String,
  }
}
</script>

<style>

</style>