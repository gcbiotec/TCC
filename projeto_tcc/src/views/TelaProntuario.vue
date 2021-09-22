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
                :key="pacienteDoProntuario.idpaciente"
                v-for="pacienteDoProntuario in listaPacientes"
                :value="pacienteDoProntuario.idpaciente"
              >
                {{ pacienteDoProntuario.nome }}
              </option>
            </select>
          </div>

          <div class="col-3">
            <form>
              <label id="escolhaIdade" for="formControlIdade"
                >Informe a idade:</label
              >
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

          <div class="col-3">
            <form>
              <label id="escolhaData" for="formControlData"
                >Informe a data:</label
              >
              <input
                id="validationDefault02"
                v-model="prontuario.datacriacao"
                type="text"
                class="form-control"
                placeholder="Formato: aaaa-mm-dd hh:mm:ss"
                
              />
            </form>
          </div>
        </form>
      </div>
    </div>

    <div class="container" id="campos">
      <h3>Informe os valores dos parâmetros clínicos:</h3>

      <div class="row" id="linha1">
        <div class="col-6">
          <form>
            <label id="escolhaGlicose" for="formControlGlicose">Glicose:</label>
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
        <div class="col-6">
          <form>
            <label id="escolhaCreatinina" for="formControlCreatinina"
              >Creatinina:</label
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
      </div>

        <div class="row" id="linha2">
        <div class="col-6">
          <form>
            <label id="escolhaAlbumina" for="formControlAlbumina"
              >Albumina:</label
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
         
        <div class="col-6">
          <form>
            <label id="escolhaCKMB" for="formControlCKMB">CK_MB:</label>
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
        </div>

      <div class="row" id="linha3">

        <div class="col-6">
          <form>
            <label id="escolhaHDL" for="formControlHDL">HDL:</label>
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

        
        <div class="col-6">
          <form>
            <label id="escolhaLDL" for="formControlLDL">LDL:</label>
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
      

    <div class="row" id="linha4">
          <div class="col-6">
            <form>
              <label id="escolhaHemoglobina" for="formControlHemoglobina"
                >Hemoglobina:</label
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
    
          <div class="col-6">
            <form>
              <label id="escolhaLeucocitos" for="formControlLeucocitos"
                >Leucócitos:</label
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
      </div> 
        
        <div class="row" id="linha5">

          <div class="col-6">
            <form>
              <label id="escolhaTroponina" for="formControlTroponina"
                >Troponina:</label
              >
              <input
                id="validationDefault02"
                v-model="prontuario.troponina"
                type="number"
                value="1"
                min="0.5"
                max="30"
                step="1"
              />
            </form>
          </div>
              
         <div class="col-6">
            <form>
              <label id="escolhaNeutrofilos" for="formControlNeutrofilos"
                >Neutrófilos:</label
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
      </div>

      <div class="container" id="campos">
        <div class="row">
          <h5>Possui hipertensão?</h5>
          <form class="needs-validation" novalidate>
            <div id="campoDeHipertensao" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.hipertensao"
                type="radio"
                value="sim"
                class="form-check-input"
                placeholder="O paciente possui hipertensão?"
              />
              <label class="form-check-label" for="exampleRadios1"> Sim </label>
            </div>
            <div id="campoDeHipertensao" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.hipertensao"
                type="radio"
                value="Nao"
                class="form-check-input"
              />
              <label class="form-check-label" for="exampleRadios1"> Não </label>
            </div>
          </form>
        </div>

        <div class="row">
          <h5>Possui Diabetes?</h5>
          <form class="needs-validation" novalidate>
            <div id="campoDeDiabetes" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.diabetes"
                type="radio"
                value="Sim"
                class="form-check-input"
              />
              <label class="form-check-label" for="exampleRadios1"> Sim </label>
            </div>
            <div id="campoDeDiabetes" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.diabetes"
                type="radio"
                value="Nao"
                class="form-check-input"
              />
              <label class="form-check-label" for="exampleRadios1"> Não </label>
            </div>
          </form>
        </div>

        <div class="row">
          <h5>Tabagista?</h5>
          <form class="needs-validation" novalidate>
            <div id="campoDeTabagismo" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.fumante"
                type="radio"
                value="Sim"
                class="form-check-input"
              />
              <label class="form-check-label" for="exampleRadios1"> Sim </label>
            </div>

            <div id="campoDeTabagismo" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.fumante"
                type="radio"
                value="Nao"
                class="form-check-input"
              />
              <label class="form-check-label" for="exampleRadios1"> Não </label>
            </div>
          </form>
        </div>

        <div class="row">
          <h5>Possui histórico de alcoolismo?</h5>
          <form class="needs-validation" novalidate>
            <div id="campoDeAlcoolismo" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.alcoolismo"
                type="radio"
                class="form-check-input"
                value="Sim"
              />
              <label class="form-check-label" for="exampleRadios1"> Sim </label>
            </div>
            <div id="campoDeAlcoolismo" class="form-check">
              <input
                id="validationDefault01"
                v-model="prontuario.alcoolismo"
                type="radio"
                class="form-check-input"
                value="Nao"
              />
              <label class="form-check-label" for="exampleRadios1"> Não </label>
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
                placeholder="Descreva as comorbidades"
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
                placeholder="Descreva o diagnóstico principal do paciente"
              />
            </div>
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
      if (
        this.prontuario.idpaciente == undefined ||
        this.prontuario.idpaciente == ""
      ) {
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

#escolhaHemoglobina {
  display: flex;
  flex-direction: column;
  align-items: left;
}

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

#campoDeComorbidade {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}

#campoDeDiagnostico {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}

#campos {
 
  padding-top: 90pt;
}

#linha1 {
  display: flex;
  padding-top: 40pt;
    text-align: justify;


}
#linha2 {
  display: flex;
  padding-top: 40pt;
      text-align: justify;


}
#linha3 {
  display: flex;
  padding-top: 40pt;
      text-align: justify;


}
#linha4 {
  display: flex;
  padding-top: 40pt;
      text-align: justify;


}
#linha5 {
  display: flex;
  padding-top: 40pt;
      text-align: justify;


}
</style>