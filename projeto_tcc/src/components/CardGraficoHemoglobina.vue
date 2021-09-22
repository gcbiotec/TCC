<template>
  <div id="Grafico">
    <div id="titulos">
    <h3>{{titulo}}</h3>
    <h5>{{subtitulo}}</h5>
    </div>

     <visualisation-hemoglobina></visualisation-hemoglobina>

  </div>  
</template>

<script>
import VisualisationHemoglobina from "@/components/VisualisationHemoglobina.vue";

export default {
    name: 'CardGrafico',
    props: {
    titulo: String,
    subtitulo: String,
  },

  components: {
      VisualisationHemoglobina
    },
    
}
</script>

<style>

</style>