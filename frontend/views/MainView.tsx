import { Button } from "@hilla/react-components/Button.js";
import { Notification } from "@hilla/react-components/Notification.js";
import { TextField } from "@hilla/react-components/TextField.js";
import {HelloEndpoint, MyEndpoint} from "Frontend/generated/endpoints.js";
import { AutoGrid } from "@hilla/react-crud";
import { useState } from "react";
import MyEntityModel from "Frontend/generated/org/vaadin/example/endpoints/MyEntityModel";

export default function MainView() {
  const [name, setName] = useState("");

  return (
    <>
      <TextField
        label="Your name"
        onValueChanged={(e) => {
          setName(e.detail.value);
        }}
      />
      <Button
        onClick={async () => {
          const serverResponse = await HelloEndpoint.sayHello(name);
          Notification.show(serverResponse);
        }}
      >
        Say hello
      </Button>
        <AutoGrid service={MyEndpoint} model={MyEntityModel}/>
    </>
  );
}
