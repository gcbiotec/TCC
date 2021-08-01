<template>
  <div>
    <div class="card">
      <div class="card-body">
        <card-boas-vindas
          titulo="Bem vindo ao Data Clinic"
          subtitulo="A maneira mais fácil de entrar no mundo dos dados!"
        />
        <card-hospital
          titulo="Hospital de Pediatria"
          subtitulo="Hospital do Carinho!"
        />
      </div>
    </div>

    <div class="row">
      <div class="col-6" id="Cadastro">
        <button
          @click="IrParaCadastro"
          type="button"
          class="btn btn-outline-primary"
        >
          <card-cadastro
            titulo="Cadastro de Novos Pacientes"
            subtitulo="Clique aqui para cadastrar um novo paciente!"
          />
        </button>
      </div>
    </div>

  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

import CardBoasVindas from "@/components/CardBoasVindas.vue";
import CardHospital from '../components/CardHospital.vue';
import CardCadastro from "../components/CardCadastro.vue";

export default {
  name: 'Home',
  components: {
    CardBoasVindas,
    CardHospital,
    CardCadastro,
  },
  methods:{
    IrParaCadastro(){
      this.$router.push({path:"/TelaCadastro"});
    }
  }
};
</script>
