<template>
  <div id="front">
    <div class="row">
      <div class="col-4"></div>
      <div class="col-4">
      <div class="card-body">
        <card-boas-vindas
          titulo="Bem vindo ao Data Clinic"
          subtitulo="A maneira mais fácil de entrar no mundo dos dados!"
        />
      </div>
      </div>
      <div class="col-4"></div>
    </div>  
    <div class="row">
      <div class="col-4"></div>
      <div class="col-4">
      <card-hospital
        titulo="Hospital de Pediatria"
        subtitulo="Hospital do Carinho!"
      />
    </div>
    </div>
    <div class="col-4"></div>

    

    <div class="row" id="CadastroPaciente">
     <div class="col-3"></div>

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
      <div class="col-3"></div>
    </div>

    <div class="row" id="CadastroProntuario">
      <div class="col-3"></div>
      <div class="col-6">
        <button
          @click="IrParaCadastroProntuario"
          type="button"
          class="btn btn-outline-primary"
        >
          <card-cadastro
            titulo="Acesso ao cadastro de prontuário"
            subtitulo="Clique aqui para cadastrar prontuário do paciente!"
          />
        </button>
      </div>
      <div class="col-3"></div>
    </div>

    <div class="row" id="PaginaGraficos">
     <div class="col-3"></div>
      <div class="col-6" id="Grafico">
        <button
          @click="IrParaGrafico"
          type="button"
          class="btn btn-outline-primary"
        >
          <card-cadastro
            titulo="Acesso aos gráficos"
            subtitulo="Clique aqui para acessar os gráficos com dados do paciente!"
          />
        </button>
      </div>
    <div class="col-3"></div>
    </div>

  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

import CardBoasVindas from "@/components/CardBoasVindas.vue";
import CardHospital from "../components/CardHospital.vue";
import CardCadastro from "../components/CardCadastro.vue";

export default {
  name: "Home",
  components: {
    CardBoasVindas,
    CardHospital,
    CardCadastro,
  },
  methods: {
    IrParaCadastro() {
      this.$router.push({ path: "/TelaCadastro" });
    },
    IrParaGrafico() {
      this.$router.push({ path: "/TelaGrafico" });
    },
    IrParaCadastroProntuario() {
      this.$router.push({ path: "/TelaProntuario" });
    },
  },
};
</script>
<style scoped>
.front {
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;
}
#grafico {
  text-align: left;
  border: 3px solid green;
}

#CadastroProntuario {
  text-align: center;
  border: 3px solid green;
  padding: 15px;
}
#CadastroPaciente {
  text-align: center;
  border: 3px solid green;
  padding: 15px;
}
#PaginaGraficos {
  text-align: center;
  border: 3px solid green;
  padding: 15px;
}
#card-body {
  align-items: center;
  border: 3px solid green;

}
</style>