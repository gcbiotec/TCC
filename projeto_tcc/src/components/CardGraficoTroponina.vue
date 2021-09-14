<template>
  <div id="Grafico">
    <div id="titulos">
    <h3>{{titulo}}</h3>
    <h5>{{subtitulo}}</h5>
    </div>

     <visualisation-troponina></visualisation-troponina>

  </div>  
</template>

<script>
import VisualisationTroponina from "@/components/VisualisationTroponina.vue";

export default {
    name: 'CardGrafico',
    props: {
    titulo: String,
    subtitulo: String,
  },

  components: {
      VisualisationTroponina
      },
    
}
</script>

<style>

</style>