<template>
  <div>
    <div class="row">
      <div class="col-3"></div>
      <div class="col-6">
        <img id="imagem" src="../assets/icon-prontuario.png" />
        <h2>Cadastro de Prontuários</h2>
      </div>
      <div class="col-3"></div>
    </div>

    <div class="container">
      <div class="row">
        <form class="needs-validation" novalidate>
          <div id="campoPaciente" class="col-3">
            <label>Escolha o paciente deste prontuário:</label>
            <select v-model="prontuario.idpaciente">
              <option
                :key="pacienteDoProntuario.id"
                v-for="pacienteDoProntuario in listaPacientes"
                :value="pacienteDoProntuario.id"
              >
                {{ pacienteDoProntuario.nome }}
              </option>
            </select>
          </div>
        </form>
      </div>
    </div>

    <div class="container">
      <div class="row">
        <div class="col-3">
          <form>
            <label id="escolhaGlicose" for="formControlGlicose"
              >Informe a concentração de glicose:</label
            >
            <input
              id="validationDefault02"
              v-model="prontuario.glicose"
              type="number"
              value="1"
              min="1"
              max="200"
              step="1"
            />
          </form>
        </div>
        <div class="col-3">
          <form>
            <label id="escolhaCreatinina" for="formControlCreatinina"
              >Informe a concentração de creatinina:</label
            >
            <input
              id="validationDefault02"
              v-model="prontuario.creatinina"
              type="number"
              value="1"
              min="0.5"
              max="3"
              step="1"
            />
          </form>
        </div>
        <div class="col-3">
          <form>
            <label id="escolhaAlbumina" for="formControlAlbumina"
              >Informe a concentração de albumina:</label
            >
            <input
              id="validationDefault02"
              v-model="prontuario.albumina"
              type="number"
              value="1"
              min="0.5"
              max="3"
              step="1"
            />
          </form>
        </div>
      </div>

      <div class="row">
        <div class="col-3">
          <form>
            <label id="escolhaCKMB" for="formControlCKMB"
              >Informe a concentração de CK_MB:</label
            >
            <input
              id="validationDefault02"
              v-model="prontuario.ck_mb"
              type="number"
              value="1"
              min="0.5"
              max="5"
              step="1"
            />
          </form>
        </div>

        <div class="row">
          <div class="col-3">
            <form>
              <label id="escolhaHDL" for="formControlHDL"
                >Informe a concentração de HDL:</label
              >
              <input
                id="validationDefault02"
                v-model="prontuario.HDL"
                type="number"
                value="1"
                min="0.5"
                max="400"
                step="1"
              />
            </form>
          </div>
          <div class="col-3">
            <form>
              <label id="escolhaLDL" for="formControlLDL"
                >Informe a concentração de LDL:</label
              >
              <input
                id="validationDefault02"
                v-model="prontuario.LDL"
                type="number"
                value="1"
                min="0.5"
                max="400"
                step="1"
              />
            </form>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-3">
        <form>
          <label id="escolhaHemoglobina" for="formControlHemoglobina"
            >Informe a concentração de hemoglobina:</label
          >
          <input
            id="validationDefault02"
            v-model="prontuario.hemoglobina"
            type="number"
            value="1"
            min="1"
            max="20"
            step="1"
          />
        </form>
      </div>

      <div class="col-3">
        <form>
          <label id="escolhaLeucocitos" for="formControlLeucocitos"
            >Informe a concentração de leucócitos:</label
          >
          <input
            id="validationDefault02"
            v-model="prontuario.leucocitos"
            type="number"
            value="1"
            min="0.5"
            max="3"
            step="1"
          />
        </form>
      </div>

      <div class="col-3">
        <form>
          <label id="escolhaNeutrofilos" for="formControlNeutrofilos"
            >Informe a quantidade de neutrófilos:</label
          >
          <input
            id="validationDefault02"
            v-model="prontuario.neutrofilos"
            type="number"
            value="1"
            min="0.5"
            max="3"
            step="1"
          />
        </form>
      </div>
    </div>

    <div class="row">
      <form class="needs-validation" novalidate>
        <div id="campoDeHipertensao" class="container">
          <input
            id="validationDefault01"
            v-model="prontuario.hipertensao"
            type="text"
            class="form-control"
            placeholder="O paciente possui hipertensão?"
          />
        </div>
      </form>
    </div>

    <div class="row">
      <form class="needs-validation" novalidate>
        <div id="campoDeDiabetes" class="container">
          <input
            id="validationDefault01"
            v-model="prontuario.diabetes"
            type="text"
            class="form-control"
            placeholder="O paciente possui diabetes?"
          />
        </div>
      </form>
    </div>

    <div class="row">
      <form class="needs-validation" novalidate>
        <div id="campoDeTabagismo" class="container">
          <input
            id="validationDefault01"
            v-model="prontuario.fumante"
            type="text"
            class="form-control"
            placeholder="O paciente possui histórico de tabagismo?"
          />
        </div>
      </form>
    </div>

    <div class="row">
      <form class="needs-validation" novalidate>
        <div id="campoDeAlcoolismo" class="container">
          <input
            id="validationDefault01"
            v-model="prontuario.alcoolismo"
            type="text"
            class="form-control"
            placeholder="O paciente possui histórico de alcoolismo?"
          />
        </div>
      </form>
    </div>

    <div class="row">
      <form class="needs-validation" novalidate>
        <div id="campoDeComorbidade" class="container">
          <input
            id="validationDefault01"
            v-model="prontuario.comorbidades"
            type="text"
            class="form-control"
            placeholder="O paciente possui histórico de comorbidades?"
          />
        </div>
      </form>
    </div>

    <div class="row">
      <form class="needs-validation" novalidate>
        <div id="campoDeDiagnostico" class="container">
          <input
            id="validationDefault01"
            v-model="prontuario.diagnostico"
            type="text"
            class="form-control"
            placeholder="Qual o diagnóstico principal do paciente?"
          />
        </div>
      </form>
    </div>

    <div class="row">
      <form>
        <label id="escolhaIdade" for="formControlIdade">Informe a idade:</label>
        <input
          id="validationDefault02"
          v-model="prontuario.idade"
          type="number"
          value="1"
          min="1"
          max="110"
          step="1"
        />
      </form>
    </div>

    <div id="botao" class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
          <button type="button" class="btn btn-primary" @click="salvar()">
            Salvar
          </button>
          <div>
            <span v-if="mensagemErro != ' '">{{ mensagemErro }}</span>
          </div>
          <div class="col-4"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "telaprontuario",
  data() {
    return {
      prontuario: {},
      listaPacientes: {},
      mensagemErro: "",
    };
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
  methods: {
    dadosValidos() {
      if (this.prontuario.nome == undefined || this.prontuario.nome == "") {
        return false;
      }
      return true;
    },
    salvar() {
      if (!this.dadosValidos()) {
        this.mensagemErro = "Você deve preencher os dados do prontuário!";
        return;
      }

      fetch("http://localhost:8080/prontuarios", {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        body: JSON.stringify(this.prontuario),
      }).then((response) => {
        if (response.ok) {
          alert("O prontuário foi cadastrado!"), this.$router.push("/");
        }
      });
    },
  },
};
</script>

<style scoped>
#imagem {
  height: 200px;
  width: 60%;
  align-items: center;
  background-color: powderblue;
  padding-top: 40pt;
}

#campoDeNome {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
  width: 65%;
}

#botao {
  align-content: bottom;
  padding-top: 40pt;
}
/* #escolhaRaca {
  display: flex;
  flex-direction: column;
}
#escolhaPeso {
  display: flex;
  flex-direction: column; */

#escolhaIdade {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}

#escolhaPeso {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}

#escolhaDiagnostico {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}
</style>